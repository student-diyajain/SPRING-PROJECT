package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.model.Product;
import spring.service.productService;

@Controller
public class homeController {

	@Autowired
	private productService productService;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products=productService.getAllProduct();
		m.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("/addForm")
	public String add(Model m) {
		m.addAttribute("title", "Add Product");
		return "add";
	}

	@RequestMapping("/updateForm/{productId}")
	public String update(@PathVariable("productId") int id,Model m) {
		Product product=productService.getProduct(id);
		m.addAttribute("p",product);
		m.addAttribute("title", "Update Product");
		return "update";
	}
	
	@RequestMapping("/deleteForm/{productId}")
	public String delete(@PathVariable("productId") int id) {
		productService.deleteProduct(id);
		return "redirect:/";
	}
	
	
	@RequestMapping(path="/handle-product",method=RequestMethod.POST)
	public String handleProduct(@ModelAttribute Product product) {
	     System.out.println(product);
	     productService.createProduct(product);
	     System.out.println("inserted!");
		return "redirect:/";
	}
	
	

	
}

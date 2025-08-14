package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/first")
public class myController {

	@RequestMapping({"/","/home"})
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		List<String> list=new ArrayList<>();
		list.add("diya");
		list.add("rahul");
		list.add("priyanka");
		list.add("shweta");
		model.addAttribute("friends",list);
		return "about";
	}
	
}

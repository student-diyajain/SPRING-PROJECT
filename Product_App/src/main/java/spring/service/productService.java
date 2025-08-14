package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.productDao;
import spring.model.Product;

@Service
public class productService {
	
	@Autowired
	private productDao productDao;
	
	//insert or update 
	public void createProduct(Product product) {
         productDao.create(product);
	}
	
	//delete
	public void deleteProduct(int productId) {
		   productDao.delete(productId);
	}
	

	//getProduct
	public Product getProduct(int productId) {
		  return productDao.getProduct(productId);
	}
	
	//getAllProduct
	public List<Product> getAllProduct() {
		  return productDao.getAllProduct();
	}
	

}

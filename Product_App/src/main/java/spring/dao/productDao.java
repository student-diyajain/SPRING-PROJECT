package spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Product;


@Repository
public class productDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//insert  or update 
	@Transactional
	public void create(Product product) {
		hibernateTemplate.saveOrUpdate(product);
		
	}
	
	//delete
	@Transactional
	public void delete(int productId) {
		Product product=hibernateTemplate.get(Product.class, productId);
		hibernateTemplate.delete(product);
	}
	

	
	//getProduct
	public Product getProduct(int productId) {
		Product product=hibernateTemplate.get(Product.class, productId);
		return product;
	}
	
	//getAllProduct
	public List<Product> getAllProduct() {
		List<Product> products=hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
}

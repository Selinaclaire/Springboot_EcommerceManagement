package com.example.Ecommerceapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productrepository;
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		return productrepository.findAll();
	}
	
	@GetMapping("/getProduct")
	public List<Product> getProduct(@RequestParam String productid){
		return productrepository.findByProductid(productid);
	}
	
	@GetMapping("/getByType")
	public List<Product> getProductType(@RequestParam String type){
		return productrepository.findByType(type);
	}
	
	@GetMapping("/saveProduct")
	@ResponseBody
	public String addProduct() {
		
		String productid = "AS002";
		String productname = "ASUS Zenfone";
		String description = "!";
		String quantity = "1";
		String price = "18000";
		String type = "mobile";
		
		Product cout = new Product(productid,productname,description,quantity,price,type);
		productrepository.save(cout);
		System.out.println("----------All Data saved into Database--------------");
		return "[{status:inserted}]";
	}
	
	@GetMapping("/deleteProduct")
	public String deleteByProductid(@RequestParam String productid) {
		System.out.println("productid"+productid);
		try {
       productrepository.deleteByProductid(productid);
		}catch(Exception ex) {
			System.out.println(ex);
		}
       return "[{status:deleted}]";
	}

}

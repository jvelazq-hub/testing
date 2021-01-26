package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * Use the actuator artifact to allow container to be monitored via health checks & metrics
 */
@RestController
public class ProductService {
	
		/*
		 * These are the two API's (methods) exposed by the application - eventually container 
		 */
		
		//Use ${env} to set variable (in this case --env=dev/
		//@RequestMapping("/${env}product/{id}")
	
	    /*
	     * Autowired annotation tells  compiler to instantiate the ProductRepository Class ONCE at run time so that BOTH methods can use it
	     * without having to instantiate the class on EACH method - SAVES CODE
	     */
		@Autowired
		ProductRepository prodRepo;
		@RequestMapping("/product/{id}")
		Optional<Products> getProduct(@PathVariable("id") String id) {
			System.out.println("Inside the getProduct API and ID value is: "+id);
			return prodRepo.findById(id);
		}
		
		@RequestMapping("/products")
		List <Products> getProductForCategory(@RequestParam("catId") int catId) {
			return prodRepo.findByCatId(catId);
		}


		@RequestMapping("/jvh")
		public String InitialPage() {
			
			System.out.println("inside index.html method");
			return "index";
			
		}
}

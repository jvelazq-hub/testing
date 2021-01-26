package com.example.demo;

import java.util.List;

//import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;

//public interface ProductRepository extends CrudRepository<Product, Integer> {
public interface ProductRepository extends MongoRepository<Products, String> {	
	
	//@Cacheable("productsByCategoryCache")
	List<Products> findByCatId(int catId);
	//Product findById(String id);
	
	
}

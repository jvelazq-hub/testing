package com.example.demo;

import org.springframework.data.annotation.Id;

public class Products {

	@Id
	private String id;
	private String name;
	private int catId;
	
	/*
	 * Constructor for Class
	 * Note: when implementing this type of repositories (in this case we are not using JPA)
	 * BUT a MongoRepository Class we can not include the Spring.JPA framework
	 * ALSO the property (variable) names in the constructor parameters
	 * MUST MATCH those defined for he properties. For example: in the Contructor below
	 * I must specify parameter names name & catId which EXACTLY MATCH those of the 
	 * class properties. When i specified for instance, (String productName...) I got a BOUND error
	 * indicating the productName was not linked or associated with any property in the class 
	 * such as name. Once I changed this I got no errors. Also specifying dependencies like JPA 
	 * when I was not using it (no JDBC use) while using instead the MongoRepository class caused confusion
	 * and errors. To be able to connect to MY mongodb running in my PC I had to specify
	 * spring.data.mongodb.database=masterdb in my properties file to indicate the TABLE in MongoDB to be 
	 * manipulated. This table had been created when I loaded the data to MongoDB  
	 *   
	 */
	public Products(String name, int catId) { 
	    this.name = name;
	    this.catId = catId;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}
	
	
	

	
	
	

}

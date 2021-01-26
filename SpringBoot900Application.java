package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication is a convenience annotation that ADDS all of the following:
 * 
 * @Configuration: Tags the class as a SOURCE of BEAN definitions for the application context.
 * What I understand this means is that all JAVA beans defined will be MAPPED by the REPOSITORY to the mongodb provided all fields in the Java Class bean
 * MATCH by name those in the DB
 * 
 * @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, 
 *   other beans, and various property settings. For example, if spring-webmvc is on the classpath, 
 *   this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
 *   So the artifacts included will affect the behaviour. 
 *   
 * @ComponentScan: Tells Spring to look for other components, configurations, and services in the com.example package, letting it find the CONTROLERS.
 * The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. Did you notice that there was not a single line of XML? 
 * There is no web.xml file, either. This web application is 100% pure Java and you did not have to deal with configuring any plumbing or infrastructure.
 * Spring Boot automatically handles those repositories as long as they are included in the same package (or a sub-package) of your @SpringBootApplication class.
 * For more control over the registration process, you can use the @EnableMongoRepositories annotation.
 */

@SpringBootApplication
public class SpringBoot900Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot900Application.class, args);
	}

}

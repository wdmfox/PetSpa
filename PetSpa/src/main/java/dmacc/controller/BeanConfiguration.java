package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Customer;
import dmacc.beans.Pet;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Customer customer() {
		Customer bean = new Customer();
		System.out.println("Name= " + bean.toString());
		bean.setName("Bean R Us");
		bean.setPhone("515-681-9173");
		return bean;
	}
	
	@Bean
	public Pet pet() {
		Pet bean = new Pet("Dog", "Scotty", "Fitz", 12);
		return bean;
	}
}

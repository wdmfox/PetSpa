package dmacc;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Customer;
import dmacc.beans.Pet;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.CustomerRepository;

@SpringBootApplication
public class PetSpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PetSpaApplication.class, args);
		
/*		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Customer c = appContext.getBean("customer", Customer.class);
		
		System.out.println(c.toString());   */
	}
	
	@Autowired
	CustomerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Using an existing bean
		Customer c = appContext.getBean("customer", Customer.class);
		c.setName("Victor I. Portant");
		repo.save(c);
		
		// Creating a bean to use - not managed by Spring
		Customer d = new Customer("Anne P. Mercer", "515-681-9178");
		Pet p = new Pet("Cat", "Persian", "Jake", 15);
		d.setPet(p);
		repo.save(d);
		
		List<Customer> allMyCustomers = repo.findAll();
		for(Customer cust: allMyCustomers) {
			System.out.println(cust.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

	
}

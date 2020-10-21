package dmacc.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> { }

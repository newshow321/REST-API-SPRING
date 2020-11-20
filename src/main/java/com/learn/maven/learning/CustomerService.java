package com.learn.maven.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer createUpdateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}

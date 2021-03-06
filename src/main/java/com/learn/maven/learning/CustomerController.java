package com.learn.maven.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/customers") // Get All Data
    public Map<String, Object> getAll() {
        Map<String, Object> m = new HashMap<>();
        m.put("status", Boolean.TRUE);
        m.put("message", "Data Successfully loaded.");
        m.put("data", customerService.customerRepository.findAll());
        return m;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/customers/{id}") // Get By Id
    public Map<String, Object> getById(@PathVariable("id") Long id) {
        Map<String, Object> data = new HashMap<>();
        data.put("status", Boolean.TRUE);
        data.put("message", "Data Successfully loaded.");
        data.put("data", customerService.customerRepository.findAllById(id));
        return data;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createUpdateCustomers") // Create Or Update
    public Map<String, Object> createUpdate(@RequestBody Customer customer) {
        customerService.createUpdateCustomer(customer);
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> dataBody = new HashMap<>();
        dataBody.put("id", customer.getId());
        dataBody.put("fullname", customer.getFullname());
        dataBody.put("email", customer.getEmail());
        data.put("status", Boolean.TRUE);
        data.put("message", "Data Successfully save.");
        data.put("data", dataBody);
        return data;
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/doDeleteCustomers/{id}") // Delete
    public Map<String, Object> deleteCustomer(@PathVariable("id") Long id) {
        Customer dataCustomer = customerService.customerRepository.findAllById(id);
        customerService.customerRepository.delete(dataCustomer);
        Map<String, Object> data = new HashMap<>();
        data.put("status", Boolean.TRUE);
        data.put("message", "Data Successfully deleted.");
        data.put("data", dataCustomer);
        return data;
    }
}

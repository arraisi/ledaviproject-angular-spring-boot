package com.ledavijeans.demo.controller;

import com.ledavijeans.demo.entity.Customer;
import com.ledavijeans.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by arrai on 5/16/2018.
 */

@RestController
@RequestMapping("/ledavi/customer")
public class CustomerAPI {
    @Autowired
    private CustomerRepository customer;

    @GetMapping("/")
    public List<Customer> selectAllData() {
        return customer.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Integer id) {
        return customer.findOne(id);
    }

    @PostMapping("/")
    public Customer saveData(@RequestBody Customer customer) {
        System.out.println(customer.getName());
        return this.customer.save(customer);
    }

    @PutMapping("/")
    public Customer updateData(@RequestBody Customer customer) {
        return this.customer.save(customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteData(@PathVariable("id") Integer id) {
        customer.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

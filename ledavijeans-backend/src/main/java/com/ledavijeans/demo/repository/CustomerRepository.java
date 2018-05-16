package com.ledavijeans.demo.repository;

import com.ledavijeans.demo.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by arrai on 5/16/2018.
 */

public interface CustomerRepository extends PagingAndSortingRepository <Customer, Integer>{

    public List<Customer> findAll();
    List<Customer> findByNameLike (String name);
}

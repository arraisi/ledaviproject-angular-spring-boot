package com.ledavijeans.demo.repository;

import com.ledavijeans.demo.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by arrai on 5/16/2018.
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    public List<Product> findAll();
    List<Product> findByNameLike (String name);
}

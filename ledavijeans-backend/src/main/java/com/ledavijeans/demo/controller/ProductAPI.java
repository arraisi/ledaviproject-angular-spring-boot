package com.ledavijeans.demo.controller;

import com.ledavijeans.demo.entity.Product;
import com.ledavijeans.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by arrai on 5/16/2018.
 */
@RestController
@RequestMapping("/ledavi/product")
public class ProductAPI {
    @Autowired
    private ProductRepository product;

    @GetMapping("/")
    public List<Product> selectAllData() {
        return product.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") Integer id) {
        return product.findOne(id);
    }

    @PostMapping("/")
    public Product saveData(@RequestBody Product product){
        return this.product.save(product);
    }

    @PutMapping("/")
    public Product updateData(@RequestBody Product product){
        return this.product.save(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteData(@PathVariable("id") Integer id){
        product.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package com.ledavijeans.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by arrai on 5/16/2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    private Integer id;

    @Column(name = "name_product")
    private String name;

    @Column(name = "price_product")
    private String price;


}

package com.ledavijeans.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_customer")
    private Integer id;

    @Column(name = "name_customer")
    private String name;

    @Column(name = "address_customer")
    private String address;


}
package com.turing.api.order;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;



}

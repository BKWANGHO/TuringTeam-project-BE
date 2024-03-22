package com.turing.api.product;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Product {
    @Id
    @Column(name = "productId")
    private Long id;

    @OneToMany
    private String productName ;

    

    

}

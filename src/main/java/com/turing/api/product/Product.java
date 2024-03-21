package com.turing.api.product;


import com.turing.api.order.Order;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity(name = "Products")
@NoArgsConstructor
@Getter
@ToString
public class Product {


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name ;

    @ManyToOne
    @JoinColumn(name="id",referencedColumnName = "id")
    private Order order;
}

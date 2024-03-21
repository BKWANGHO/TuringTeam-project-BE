package com.turing.api.order;

import com.turing.api.product.Product;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity(name = "order")
@Getter
public class Order {
    @Id
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private Long id;

    @Column(name = "orderDate")
    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Product product;
}

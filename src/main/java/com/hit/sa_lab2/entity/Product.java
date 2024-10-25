package com.hit.sa_lab2.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Product {
    private Long productId;
    private String productName;
    private BigDecimal price;
    // getters and setters
}

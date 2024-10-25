package com.hit.sa_lab2.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderItem {
    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
    // getters and setters
}
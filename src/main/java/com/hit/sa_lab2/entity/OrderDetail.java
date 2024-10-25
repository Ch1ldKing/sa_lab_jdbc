package com.hit.sa_lab2.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class OrderDetail {
    private Long orderId;
    private Date orderDate;
    private String status;
    private Long orderItemId;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
    // getters and setters
}
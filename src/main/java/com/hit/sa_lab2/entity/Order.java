package com.hit.sa_lab2.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Long orderId;
    private Long userId;
    private Date orderDate;
    private String status;
    // getters and setters
}
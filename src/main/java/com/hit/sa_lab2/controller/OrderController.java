package com.hit.sa_lab2.controller;

import com.hit.sa_lab2.entity.Order;
import com.hit.sa_lab2.entity.OrderDetail;
import com.hit.sa_lab2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 获取用户的所有订单
    @PostMapping("/user/{userId}")
    public List<Order> getUserOrders(@PathVariable Long userId) {
        return orderService.getUserOrders(userId);
    }

    // 获取用户的订单详情
    @GetMapping("/user/{userId}/details")
    public List<OrderDetail> getUserOrderDetails(@PathVariable Long userId) {
        return orderService.getUserOrderDetails(userId);
    }
}

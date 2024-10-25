package com.hit.sa_lab2.service;

import com.hit.sa_lab2.Mapper.OrderMapper;
import com.hit.sa_lab2.entity.Order;
import com.hit.sa_lab2.entity.OrderDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    // 查询用户的所有订单
    public List<Order> getUserOrders(Long userId) {
        return orderMapper.findOrdersByUserId(userId);
    }

    // 查询用户的订单及其订单项
    public List<OrderDetail> getUserOrderDetails(Long userId) {
        return orderMapper.findOrderDetailsByUserId(userId);
    }
}

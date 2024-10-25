package com.hit.sa_lab2.Mapper;

import com.hit.sa_lab2.entity.Order;
import com.hit.sa_lab2.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;


@Mapper
public interface OrderMapper {

    // 查询某用户的所有订单
    @Select("SELECT order_id, user_id, order_date, status FROM orders WHERE user_id = #{userId}")
    List<Order> findOrdersByUserId(@Param("userId") Long userId);

    // 查询某用户的订单及其订单项
    List<OrderDetail> findOrderDetailsByUserId(@Param("userId") Long userId);
}


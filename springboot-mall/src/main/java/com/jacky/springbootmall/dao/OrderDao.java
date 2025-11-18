package com.jacky.springbootmall.dao;

import com.jacky.springbootmall.dto.CreateOrderRequest;
import com.jacky.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}

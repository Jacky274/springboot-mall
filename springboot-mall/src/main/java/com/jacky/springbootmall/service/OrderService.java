package com.jacky.springbootmall.service;

import com.jacky.springbootmall.dto.CreateOrderRequest;
import com.jacky.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

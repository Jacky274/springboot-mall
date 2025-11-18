package com.jacky.springbootmall.dao;

import com.jacky.springbootmall.dto.CreateOrderRequest;
import com.jacky.springbootmall.model.Order;
import com.jacky.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById (Integer orderId);

    List<OrderItem> getOrderItemsByOrderId (Integer OrderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}

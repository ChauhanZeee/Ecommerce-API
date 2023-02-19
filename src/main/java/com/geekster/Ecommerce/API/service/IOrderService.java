package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.OrderModel;

import java.util.List;

public interface IOrderService {
    public void createOrder(OrderModel orderModel);
    public List<OrderModel> getAllOrder();
    public OrderModel orderByOrderId(Integer id);
}

package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.Repository.IOrderRepository;
import com.geekster.Ecommerce.API.model.OrderModel;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;
    @Override
    public void createOrder(OrderModel orderModel){
        orderRepository.save(orderModel);
    }
    @Override
    public List<OrderModel> getAllOrder(){
        return orderRepository.findAll();
    }
    @Override
    public OrderModel orderByOrderId(Integer id){
        return orderRepository.findById(id).get();
    }
}

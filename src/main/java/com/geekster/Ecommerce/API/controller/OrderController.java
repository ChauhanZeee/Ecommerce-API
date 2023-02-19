package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.OrderModel;
import com.geekster.Ecommerce.API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Ecommerce")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/place-an-order")
    public void createOrder(@RequestBody OrderModel orderModel){
        orderService.createOrder(orderModel);
    }
    @GetMapping("/get/all-order")
    public List<OrderModel> model(){
        return orderService.getAllOrder();
    }
    @GetMapping("/get-order-by-order/id/{id}")
    public OrderModel model(@PathVariable Integer id){
        return orderService.orderByOrderId(id);
    }
}

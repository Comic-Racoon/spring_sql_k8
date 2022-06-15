package com.spring_deployment_sql.spring_sql.controller;

import com.spring_deployment_sql.spring_sql.entity.Order;
import com.spring_deployment_sql.spring_sql.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @Autowired
    private OrderService service;

    // get all
    @GetMapping
    public List<Order> getOrders(){
        return service.getOrders();
    }
    // get with id
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        return service.getOrderById(id);
    }
    // add order

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        return  service.addOrder(order);
    }


}

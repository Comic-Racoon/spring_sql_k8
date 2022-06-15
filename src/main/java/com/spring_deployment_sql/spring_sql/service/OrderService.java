package com.spring_deployment_sql.spring_sql.service;

import com.spring_deployment_sql.spring_sql.entity.Order;
import com.spring_deployment_sql.spring_sql.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService{

    @Autowired
    private OrderRepository repository;
    public List<Order> getOrders() {
        return repository.findAll();
    }


    public Order getOrderById(int id) {
        return repository.findById(id)
                .orElseThrow(
                        ()-> new IllegalArgumentException("Invalid id: "+ id));
    }

    public Order addOrder(Order order) {
        return repository.save(order);
    }
}

package com.spring_deployment_sql.spring_sql.repository;

import com.spring_deployment_sql.spring_sql.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}

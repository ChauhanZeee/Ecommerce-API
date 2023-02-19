package com.geekster.Ecommerce.API.Repository;

import com.geekster.Ecommerce.API.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<OrderModel, Integer> {
}

package com.logistia.order_service.Repository;

import com.logistia.order_service.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // Tìm đơn hàng theo trạng thái
    List<Order> findByStatus(String status);


    List<Order> findBySenderNameContaining(String keyword);


    List<Order> findByShippingCostBetween(Double minCost, Double maxCost);
}


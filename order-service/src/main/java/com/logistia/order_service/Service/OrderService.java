package com.logistia.order_service.Service;

import com.logistia.order_service.Model.Order;

import java.util.List;

public interface OrderService {



    Order createOrder(Order order);


    Order getOrderById(Long id);


    List<Order> getOrdersByStatus(String status);


    List<Order> searchOrders(String keyword);


    Order updateOrderStatus(Long id, String status);
}

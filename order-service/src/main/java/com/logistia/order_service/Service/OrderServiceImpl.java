package com.logistia.order_service.Service;

import com.logistia.order_service.Model.Order;
import com.logistia.order_service.Model.OrderStatus;
import com.logistia.order_service.Repository.OrderRepository;
import com.logistia.order_service.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order createOrder(Order order) {
        //
        //
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found with ID: " + id));
    }

    @Override
    public List<Order> getOrdersByStatus(String status) {
        return orderRepository.findByStatus(status);
    }

    @Override
    public List<Order> searchOrders(String keyword) {
        return orderRepository.findBySenderNameContaining(keyword);
    }



    @Override
    public Order updateOrderStatus(Long id, String status) {
        Order order = getOrderById(id);
        order.setStatus(OrderStatus.valueOf(status));
        return orderRepository.save(order);
    }
}


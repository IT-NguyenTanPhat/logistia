package com.logistia.order_service.Controller;

import com.logistia.order_service.Model.Order;
import com.logistia.order_service.Service.OrderService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return new String("Order Service is running!");
    }


    @GetMapping(value = {"/{id}" })
    public Order getOrder(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
    
}

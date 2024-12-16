package com.logistia.order_service.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class OrderController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return new String("Order Service is running!");
    }
    
}

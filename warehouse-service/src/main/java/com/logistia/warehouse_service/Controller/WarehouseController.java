package com.logistia.warehouse_service.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class WarehouseController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return new String("Warehouse Service is running!");
    }
    
}

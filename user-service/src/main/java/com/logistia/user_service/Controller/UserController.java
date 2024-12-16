package com.logistia.user_service.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class UserController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return new String("User Service is running!");
    }
    
}

package com.logistia.api_gateway.Controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@Log4j2
public class ApiGatewayController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return new String("API Gateway is running!");
    }

}

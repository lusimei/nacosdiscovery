package com.itheima.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@RestController
public class ApiGatewayBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayBootstrap.class,args);
    }

//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @GetMapping("/property")
//    public String getProperty(){
//        return webApplicationContext.getEnvironment().getProperty("zuul.routes.application1.path");
//    }
}

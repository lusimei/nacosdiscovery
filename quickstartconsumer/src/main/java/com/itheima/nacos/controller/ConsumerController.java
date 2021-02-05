package com.itheima.nacos.controller;

import com.itheima.nacos.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        String providerResult = providerClient.service();
        return "consumer invoke |" + providerResult;
    }
}

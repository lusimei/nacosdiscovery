package com.itheima.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("quickstart-provider")
public interface ProviderClient {

    @GetMapping("/service")
    public String service();
}

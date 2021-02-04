package com.itheima.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("quickstart-provider")
@Profile("/providerClient")
public interface ProviderClient {

    @GetMapping("/service")
    public String service();
}

package com.itheima.microservice.service2.service;

import com.itheima.microservice.service2.api.ProviderService;
@org.apache.dubbo.config.annotation.Service //注解标记此类的方法暴露为dubbo接口
public class ProviderServiceImpl implements ProviderService {

    public String service() {
        return "provider invoke";
    }
}

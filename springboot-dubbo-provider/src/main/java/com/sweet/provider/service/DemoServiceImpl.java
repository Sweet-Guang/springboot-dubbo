package com.sweet.provider.service;
import com.sweet.common.service.DemoService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String str) {
        return "Hello "+str;


    }
}

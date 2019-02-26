/*
 * Copyright (c) 2018年03月13日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package com.zml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/3/13
 * @Version 1.0.0
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}

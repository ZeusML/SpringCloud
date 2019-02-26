/*
 * Copyright (c) 2018年06月04日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package com.zml;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/6/4
 * @Version 1.0.0
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class TraceApplication {

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace() {
        logger.info("===<call trace-2>===");
        return "Trace";
    }

    public static void main(String[] args) {
        SpringApplication.run(TraceApplication.class, args);
    }

}

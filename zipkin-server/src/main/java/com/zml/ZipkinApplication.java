/*
 * Copyright (c) 2018年06月04日  by XuanWu Wireless Technology Co., Ltd 
 *             All rights reserved  
 */
package com.zml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * @author <a href="mailto:zhaominglin@wxchina.com">minglin.Zhao</a>
 * @Description
 * @Date 2018/6/4
 * @Version 1.0.0
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}

package com.xcl.ad;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/04/2019/16:34
 * @Description: 注册与服务发现程序server
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}

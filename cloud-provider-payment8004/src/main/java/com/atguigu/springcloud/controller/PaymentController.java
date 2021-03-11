package com.atguigu.springcloud.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.UUID;

/**
 * Demo class
 *
 * @author houzhixu
 * @date 2021/3/11
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk(){
        return "spring with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}

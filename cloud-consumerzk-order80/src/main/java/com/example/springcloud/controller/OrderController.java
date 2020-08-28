package com.example.springcloud.controller;/**
 * @Classname OrderController
 * @Description TODO
 * @Date 8/27/2020 11:19 PM
 * @Created by yucui.wang
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author Wang Yucui
 * @Date 8/27/2020 11:19 PM
 */
@RestController
@Slf4j
public class OrderController {
    private static  final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }
}


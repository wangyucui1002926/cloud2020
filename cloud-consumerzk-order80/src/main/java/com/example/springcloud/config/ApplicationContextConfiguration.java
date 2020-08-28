package com.example.springcloud.config;/**
 * @Classname ApplicationContextConfiguration
 * @Description TODO
 * @Date 8/27/2020 11:20 PM
 * @Created by yucui.wang
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author Wang Yucui
 * @Date 8/27/2020 11:20 PM
 */
@Configuration
public class ApplicationContextConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}

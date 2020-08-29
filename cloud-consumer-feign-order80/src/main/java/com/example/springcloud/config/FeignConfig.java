package com.example.springcloud.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author Wang Yucui
 * @Date 8/29/2020 9:14 PM
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLevel(){
        return Logger.Level.FULL;
    }

}

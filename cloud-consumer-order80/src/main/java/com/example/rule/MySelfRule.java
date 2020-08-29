package com.example.rule;/**
 * @Classname MySelfRule
 * @Description TODO
 * @Date 8/28/2020 4:45 PM
 * @Created by yucui.wang
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author Wang Yucui
 * @Date 8/28/2020 4:45 PM
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}

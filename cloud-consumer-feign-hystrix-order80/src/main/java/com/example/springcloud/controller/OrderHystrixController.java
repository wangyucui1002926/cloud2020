package com.example.springcloud.controller;

import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname OrderHystrixController
 * @Description TODO
 * @Date 8/30/2020 6:42 AM
 * @Created by yucui.wang
 */
@RestController
@DefaultProperties(defaultFallback = "paymentInfo_Global_FallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }


    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    //    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    public String paymentFeignTimeout(@PathVariable("id") Integer id) {
        //为了演示全局降级处理，特意加的错误代码
        int age = 10 / 0;
        return paymentHystrixService.paymentInfo_Timeout(id);
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "我是消费者80,对方支付系统繁忙，请10秒钟之后再试，或者自己运行出错检查自己/(ㄒoㄒ)/~~";
    }
    /**
     * @Description 下面是全局fallback方法
     */
    public String paymentInfo_Global_FallbackMethod() {
        return "Global异常处理信息，请稍后再试， /(ToT)/";
    }
}

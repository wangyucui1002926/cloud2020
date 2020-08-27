package com.example.springcloud.service;

import com.example.springcloud.entities.Payment;

/**
 *
 * @Description 支付 Service
 * @Author Wang Yucui
 * @Date 8/25/2020 11:25 PM
 */
public interface PaymentService {
    /**
     * 新增
     *
     * @param payment 支付实体
     * @return 改变行数
     */
    int create(Payment payment);

    /**
     * 新增
     *
     * @param id 主键
     * @return 支付实体
     */
    Payment getPaymentById(Long id);
}

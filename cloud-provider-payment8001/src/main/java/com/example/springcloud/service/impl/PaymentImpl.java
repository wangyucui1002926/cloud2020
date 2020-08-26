package com.example.springcloud.service.impl;

import com.example.springcloud.dao.PaymentDao;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 支付接口实现类
 * @Author Wang Yucui
 * @Date 8/25/2020 11:27 PM
 */
@Service
public class PaymentImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

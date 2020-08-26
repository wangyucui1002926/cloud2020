package com.example.springcloud.dao;

import com.example.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 推荐使用@Mapper，@Repository在执行插入操作时有时会有问题
 *
 * @author yucui.wang
 * @date 8/21/2020 5:35 PM
 */

@Repository
public interface PaymentDao {
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
    Payment getPaymentById(@Param("id") Long id);
}

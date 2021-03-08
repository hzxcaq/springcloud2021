package com.atguigu.springcloud.dao;


import com.atguigu.spirngcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Demo class
 *
 * @author houzhixu
 * @date 2021/3/4
 */
@Mapper
// @Repository //推荐使用mapper，res可能插入有问题
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

package io.shardingsphere.example.spring.boot.mybatis.repository;

import io.shardingsphere.example.spring.boot.mybatis.entity.OrderEntity;
import org.springframework.stereotype.Repository;

@Repository("OrderEntityMapper")
public interface OrderEntityMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    OrderEntity selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);
}
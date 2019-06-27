package com.b4pay.order.dao;

import com.b4pay.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @ClassName OrderDao
 * @Description 下注
 * @Version 2.1
 **/
public interface OrderDao extends JpaRepository<Order,String>, JpaSpecificationExecutor<Order> {
}

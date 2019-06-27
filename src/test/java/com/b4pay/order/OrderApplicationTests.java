package com.b4pay.order;

import com.b4pay.order.dao.OrderDao;
import com.b4pay.order.entity.Order;
import com.b4pay.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void contextLoads() {


    }


}

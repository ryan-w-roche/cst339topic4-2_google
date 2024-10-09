package com.gcu.business;

import com.gcu.data.OrderDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersBusinessService implements OrdersBusinessInterface {

    @Autowired
    private OrderDataService service;

    @Override
    public void test() {
        System.out.println("Hello from the OrdersBusinessService");
    }

    @Override
    public List<OrderModel> getOrders() {
        List<OrderEntity> orderEntities = service.findAll();

        List<OrderModel> ordersDomain = new ArrayList<>();
        for (OrderEntity entity : orderEntities)
        {
            ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
        }

        return ordersDomain;
    }

    @Override
    public void init() {
        System.out.println("Hello from the OrdersBusinessService init() method");
    }

    @Override
    public void destroy() {
        System.out.println("Hello from the OrdersBusinessService destroy() method");
    }
}

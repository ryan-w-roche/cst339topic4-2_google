package com.gcu.business;


import com.gcu.model.OrderModel;

import java.util.List;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

    @Override
    public void test() {
        System.out.println("Hello from the AnotherOrdersBusinessService");
    }

    @Override
    public List<OrderModel> getOrders() {
        return null;
    }

    @Override
    public void init() {
        System.out.println("Hello from the AnotherOrdersBusinessService init() method");
    }

    @Override
    public void destroy() {
        System.out.println("Hello from the AnotherOrdersBusinessService destroy() method");
    }
}

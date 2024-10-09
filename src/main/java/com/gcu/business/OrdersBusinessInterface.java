package com.gcu.business;

import com.gcu.model.OrderModel;

import java.util.ArrayList;
import java.util.List;

public interface OrdersBusinessInterface {
    public void test();

    public List<OrderModel> getOrders();

    public void init();
    public void destroy();
}

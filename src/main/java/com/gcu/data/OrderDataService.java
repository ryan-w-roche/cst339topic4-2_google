package com.gcu.data;

import com.gcu.data.DataAccessInterface;
import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDataService implements DataAccessInterface<OrderEntity>
{
    @Autowired
    private OrdersRepository ordersRepository;

    public OrderDataService(OrdersRepository ordersRepository)
    {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrderEntity> findAll() {
        List<OrderEntity> orders = new ArrayList<>();

        try
        {
            // Get all the Entity Orders
            Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();

            // Convert to a List and return the List
            orders = new ArrayList<>();
            ordersIterable.forEach(orders::add);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return orders;
    }

    @Override
    public OrderEntity findById(int id) {
        return null;
    }

    @Override
    public boolean create(OrderEntity order) {
        try
        {
            this.ordersRepository.save(order);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean update(OrderEntity orderEntity) {
        return false;
    }

    @Override
    public boolean delete(OrderEntity orderEntity) {
        return false;
    }
}

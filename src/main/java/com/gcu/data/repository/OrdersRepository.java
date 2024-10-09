package com.gcu.data.repository;

import com.gcu.data.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long>
{
}

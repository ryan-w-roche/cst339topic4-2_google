package com.gcu;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.OrdersBusinessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class SpringConfig {
    @Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
    public OrdersBusinessInterface getOrdersBusiness() {
        return new OrdersBusinessService();
    }
}

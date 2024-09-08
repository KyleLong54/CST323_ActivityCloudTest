package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {

    @Bean(name = "OrdersBusinessService", initMethod = "init", destroyMethod = "destroy")
    OrdersBusinessServiceInterface getOrdersBusiness()
	{
		return new OrdersBusinessService();
	} // end getOrdersBusiness
	
} // end SpringConfig

package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {

	@Autowired
	OrderDataService service;
	
	@Override
	public void test() {
		System.out.println("Hello");
	} // end test

	@Override
	public List<OrderModel> getOrders() {
		// Get all of the Entity Orders
		List<OrderEntity> ordersEntity = service.findAll();
		
		// Iterate over the entity orders and create a list of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for (OrderEntity entity : ordersEntity)
		{
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		} // end for
		
		// Return list of domain orders
		return ordersDomain;
	} // end getOrders

	@Override
	public void init() {
		System.out.println("In the orignal Service class init method");
	} // end init

	@Override
	public void destroy() {
		System.out.println("In the orignal Service class destroy method");
	} // end destroy

} // end OrdersBusinessService

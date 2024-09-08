package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;

@Service
public class OrderDataService implements DataAccessInterface<OrderEntity> {

	@Autowired
	private OrdersRepository ordersRepository;
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	/**
	 * Non-Default Constructor
	 * 
	 * @param ordersRepository The OrdersRepository to be used by the DataService
	 */
	public OrderDataService(OrdersRepository ordersRepository, DataSource dataSource) {
		super();
		this.ordersRepository = ordersRepository;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	} // end Non-Default Constructor

	public OrderEntity findById(int id) {
		return null;
	} // end findById

	@Override
	public List<OrderEntity> findAll() {
		List<OrderEntity> orders = new ArrayList<OrderEntity>();

		try {
			// Get all the Entity Orders
			Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();

			// Convert to a list and return the list
			orders = new ArrayList<OrderEntity>();
			ordersIterable.forEach(orders::add);
		} catch (Exception e) {
			e.printStackTrace();
		} // end try catch

		return orders;
	} // end findAll

	@Override
	public boolean create(OrderEntity order) {
		String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?, ?, ?, ?)";

		try {
			// Execute SQL insert
			jdbcTemplateObject.update(sql, order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} // end try catch
		
		return true;
	} // end create

	@Override
	public boolean update(OrderEntity t) {
		return true;
	} // end update

	@Override
	public boolean delete(OrderEntity t) {
		return true;
	} // end delete

} // end OrderDataService

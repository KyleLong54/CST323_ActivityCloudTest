package com.gcu.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Orders")
public class OrderEntity {
	@Id
	Long id;

	@Column("ORDER_NO")
	String orderNo;

	@Column("PRODUCT_NAME")
	String productName;

	@Column("PRICE")
	float price;

	@Column("QUANTITY")
	int quantity;

	/**
	 * Default Constructor
	 */
	public OrderEntity() {
		super();
	} // end Default Constructor

	/**
	 * Non-Default Constructor
	 * 
	 * @param id          The ID of the order
	 * @param orderNo     The order's number
	 * @param productName The name of the product
	 * @param price       The price of the product
	 * @param quantity    The number of products being ordered
	 */
	public OrderEntity(Long id, String orderNo, String productName, float price, int quantity) {
		super();
		this.id = id;
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	} // end Non-Default Constructor

	public Long getId() {
		return id;
	} // end getId

	public void setId(Long id) {
		this.id = id;
	} // end setId

	public String getOrderNo() {
		return orderNo;
	} // end getOrderNo

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	} // end setOrderNo

	public String getProductName() {
		return productName;
	} // end getProductName

	public void setProductName(String productName) {
		this.productName = productName;
	} // end setProductName

	public float getPrice() {
		return price;
	} // end getPrice

	public void setPrice(float price) {
		this.price = price;
	} // end setPrice

	public int getQuantity() {
		return quantity;
	} // end getQuantity

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	} // end setQuantity

} // end OrderEntity

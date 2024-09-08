package com.gcu.model;

public class OrderModel {

	private Long id;
	private String orderNo;
	private String productName;
	private float price;
	private int quantity;
	
	public OrderModel(Long id, String orderNo, String productName, float price, int quantity) {
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

} // end OrderModel

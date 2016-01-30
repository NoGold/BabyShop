package com.lfw.babyshop.entity;

import java.sql.Timestamp;

public class Order {
	private int orderId; //订单ID
	private double orderTotal; //订单总结算
	private Timestamp orderTime; //订单下单时间
	private int orderState; //订单状态
	private String orderUserName; //订单收货人姓名
	private String orderUserPhone; //订单收货人电话
	private String orderUserAddress; //订单收货人地址
	private String orderPostcode; //订单收货人邮编
	private int orderUserId; //订单下单用户ID
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public String getOrderUserName() {
		return orderUserName;
	}
	public void setOrderUserName(String orderUserName) {
		this.orderUserName = orderUserName;
	}
	public String getOrderUserPhone() {
		return orderUserPhone;
	}
	public void setOrderUserPhone(String orderUserPhone) {
		this.orderUserPhone = orderUserPhone;
	}
	public String getOrderUserAddress() {
		return orderUserAddress;
	}
	public void setOrderUserAddress(String orderUserAddress) {
		this.orderUserAddress = orderUserAddress;
	}
	public String getOrderPostcode() {
		return orderPostcode;
	}
	public void setOrderPostcode(String orderPostcode) {
		this.orderPostcode = orderPostcode;
	}
	public int getOrderUserId() {
		return orderUserId;
	}
	public void setOrderUserId(int orderUserId) {
		this.orderUserId = orderUserId;
	}

}

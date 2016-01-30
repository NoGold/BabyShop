package com.lfw.babyshop.entity;

public class OrderItem {
	private int orderitemId; //订单项ID
	private int orderItemGoodsCount; //订单项商品数量
	private double orderItemSubTotal; //订单项小计
	private int orderItemGoodsId; //订单项商品Id
	private int ownerOrderId; //订单项所属订单Id
	public int getOrderitemId() {
		return orderitemId;
	}
	public void setOrderitemId(int orderitemId) {
		this.orderitemId = orderitemId;
	}
	public int getOrderItemGoodsCount() {
		return orderItemGoodsCount;
	}
	public void setOrderItemGoodsCount(int orderItemGoodsCount) {
		this.orderItemGoodsCount = orderItemGoodsCount;
	}
	public double getOrderItemSubTotal() {
		return orderItemSubTotal;
	}
	public void setOrderItemSubTotal(double orderItemSubTotal) {
		this.orderItemSubTotal = orderItemSubTotal;
	}
	public int getOrderItemGoodsId() {
		return orderItemGoodsId;
	}
	public void setOrderItemGoodsId(int orderItemGoodsId) {
		this.orderItemGoodsId = orderItemGoodsId;
	}
	public int getOwnerOrderId() {
		return ownerOrderId;
	}
	public void setOwnerOrderId(int ownerOrderId) {
		this.ownerOrderId = ownerOrderId;
	}
	

}

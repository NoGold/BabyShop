package com.lfw.babyshop.entity;

public class Cart {
	private int CartId; //购物车Id
	private int CartOwnerId; //购物车所属用户Id
	private int CarTotal; //购物车总计
	public int getCartId() {
		return CartId;
	}
	public void setCartId(int cartId) {
		CartId = cartId;
	}
	public int getCartOwnerId() {
		return CartOwnerId;
	}
	public void setCartOwnerId(int cartOwnerId) {
		CartOwnerId = cartOwnerId;
	}
	public int getCarTotal() {
		return CarTotal;
	}
	public void setCarTotal(int carTotal) {
		CarTotal = carTotal;
	}
}

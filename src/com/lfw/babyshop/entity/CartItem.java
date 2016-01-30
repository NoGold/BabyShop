package com.lfw.babyshop.entity;

import java.sql.Timestamp;

public class CartItem {
	private int cartItemId; //购物车商品项Id
	private int cartItemCount; //购物车商品数量
	private double cartItemSubTotal; //购物车小计
	private Timestamp cartItemTime; //购物车商品添加时间
	private int ownerCartId; //购物车商品所属购物车ID
	private int cartItemGoodsId; //购物车商品ID
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getCartItemCount() {
		return cartItemCount;
	}
	public void setCartItemCount(int cartItemCount) {
		this.cartItemCount = cartItemCount;
	}
	public double getCartItemSubTotal() {
		return cartItemSubTotal;
	}
	public void setCartItemSubTotal(double cartItemSubTotal) {
		this.cartItemSubTotal = cartItemSubTotal;
	}
	public Timestamp getCartItemTime() {
		return cartItemTime;
	}
	public void setCartItemTime(Timestamp cartItemTime) {
		this.cartItemTime = cartItemTime;
	}
	public int getOwnerCartId() {
		return ownerCartId;
	}
	public void setOwnerCartId(int ownerCartId) {
		this.ownerCartId = ownerCartId;
	}
	public int getCartItemGoodsId() {
		return cartItemGoodsId;
	}
	public void setCartItemGoodsId(int cartItemGoodsId) {
		this.cartItemGoodsId = cartItemGoodsId;
	}
}

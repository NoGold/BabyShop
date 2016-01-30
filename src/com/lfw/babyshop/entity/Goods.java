package com.lfw.babyshop.entity;

import java.sql.Date;

public class Goods {
    private int goodsId; //商品ID
    private int goodsCfId; //商品一级分类Id
    private int goodsSecCfId; //商品二级分类Id
    private String goodsName; //商品名称
    private String goodsKeywords; //商品搜索关键字
    private String goodsDescription; //商品描述
    private Date goodsShelvedTime; //商品上架时间
    private String goodsSmallImg; //商品小图片
    private String goodsBigImg1; //商品大图片1
    private String goodsBigImg2; //商品大图片2
    private double goodsMarketPrice; //商品市场价
    private double goodsCheapPrice; //商品优惠价
    private double goodsDiscount; //商品折扣
    private int goodsClickCount; //商品点击数
    private int goodsOrderCount; //商品下单数
    private int goodsDealCount; //商品成交数
    private int goodsStocks; //商品库存数
    private int goodsCommentsCount; //商品评论数
    private int goodsPoints; //商品积分
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getGoodsCfId() {
		return goodsCfId;
	}
	public void setGoodsCfId(int goodsCfId) {
		this.goodsCfId = goodsCfId;
	}
	public int getGoodsSecCfId() {
		return goodsSecCfId;
	}
	public void setGoodsSecCfId(int goodsSecCfId) {
		this.goodsSecCfId = goodsSecCfId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsKeywords() {
		return goodsKeywords;
	}
	public void setGoodsKeywords(String goodsKeywords) {
		this.goodsKeywords = goodsKeywords;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	public Date getGoodsShelvedTime() {
		return goodsShelvedTime;
	}
	public void setGoodsShelvedTime(Date goodsShelvedTime) {
		this.goodsShelvedTime = goodsShelvedTime;
	}
	public String getGoodsSmallImg() {
		return goodsSmallImg;
	}
	public void setGoodsSmallImg(String goodsSmallImg) {
		this.goodsSmallImg = goodsSmallImg;
	}
	public String getGoodsBigImg1() {
		return goodsBigImg1;
	}
	public void setGoodsBigImg1(String goodsBigImg1) {
		this.goodsBigImg1 = goodsBigImg1;
	}
	public String getGoodsBigImg2() {
		return goodsBigImg2;
	}
	public void setGoodsBigImg2(String goodsBigImg2) {
		this.goodsBigImg2 = goodsBigImg2;
	}
	public double getGoodsMarketPrice() {
		return goodsMarketPrice;
	}
	public void setGoodsMarketPrice(double goodsMarketPrice) {
		this.goodsMarketPrice = goodsMarketPrice;
	}
	public double getGoodsCheapPrice() {
		return goodsCheapPrice;
	}
	public void setGoodsCheapPrice(double goodsCheapPrice) {
		this.goodsCheapPrice = goodsCheapPrice;
	}
	public double getGoodsDiscount() {
		return goodsDiscount;
	}
	public void setGoodsDiscount(double goodsDiscount) {
		this.goodsDiscount = goodsDiscount;
	}
	public int getGoodsClickCount() {
		return goodsClickCount;
	}
	public void setGoodsClickCount(int goodsClickCount) {
		this.goodsClickCount = goodsClickCount;
	}
	public int getGoodsOrderCount() {
		return goodsOrderCount;
	}
	public void setGoodsOrderCount(int goodsOrderCount) {
		this.goodsOrderCount = goodsOrderCount;
	}
	public int getGoodsDealCount() {
		return goodsDealCount;
	}
	public void setGoodsDealCount(int goodsDealCount) {
		this.goodsDealCount = goodsDealCount;
	}
	public int getGoodsStocks() {
		return goodsStocks;
	}
	public void setGoodsStocks(int goodsStocks) {
		this.goodsStocks = goodsStocks;
	}
	public int getGoodsCommentsCount() {
		return goodsCommentsCount;
	}
	public void setGoodsCommentsCount(int goodsCommentsCount) {
		this.goodsCommentsCount = goodsCommentsCount;
	}
	public int getGoodsPoints() {
		return goodsPoints;
	}
	public void setGoodsPoints(int goodsPoints) {
		this.goodsPoints = goodsPoints;
	}
}

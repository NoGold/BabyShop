package com.lfw.babyshop.entity;

import java.sql.Date;

public class Goods {
    private int goodsId; //��ƷID
    private int goodsCfId; //��Ʒһ������Id
    private int goodsSecCfId; //��Ʒ��������Id
    private String goodsName; //��Ʒ����
    private String goodsKeywords; //��Ʒ�����ؼ���
    private String goodsDescription; //��Ʒ����
    private Date goodsShelvedTime; //��Ʒ�ϼ�ʱ��
    private String goodsSmallImg; //��ƷСͼƬ
    private String goodsBigImg1; //��Ʒ��ͼƬ1
    private String goodsBigImg2; //��Ʒ��ͼƬ2
    private double goodsMarketPrice; //��Ʒ�г���
    private double goodsCheapPrice; //��Ʒ�Żݼ�
    private double goodsDiscount; //��Ʒ�ۿ�
    private int goodsClickCount; //��Ʒ�����
    private int goodsOrderCount; //��Ʒ�µ���
    private int goodsDealCount; //��Ʒ�ɽ���
    private int goodsStocks; //��Ʒ�����
    private int goodsCommentsCount; //��Ʒ������
    private int goodsPoints; //��Ʒ����
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

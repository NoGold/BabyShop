package com.lfw.babyshop.entity;

public class SecClassification {
	private int secCfId; //二级分类Id
	private int onwerCfId; //所属一级分类Id
	private String secCfName; //二级分类名称
	private String secCfDescription; //二级分类描述
	public int getSecCfId() {
		return secCfId;
	}
	public void setSecCfId(int secCfId) {
		this.secCfId = secCfId;
	}
	public int getOnwerCfId() {
		return onwerCfId;
	}
	public void setOnwerCfId(int onwerCfId) {
		this.onwerCfId = onwerCfId;
	}
	public String getSecCfName() {
		return secCfName;
	}
	public void setSecCfName(String secCfName) {
		this.secCfName = secCfName;
	}
	public String getSecCfDescription() {
		return secCfDescription;
	}
	public void setSecCfDescription(String secCfDescription) {
		this.secCfDescription = secCfDescription;
	}
}

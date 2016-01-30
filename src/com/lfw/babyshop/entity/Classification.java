package com.lfw.babyshop.entity;

public class Classification {
	private int CfId; //一级分类ID
	private String cfName; //一级分类名称
	private String cfDescription; //一级分类描述
	public int getCfId() {
		return CfId;
	}
	public void setCfId(int cfId) {
		CfId = cfId;
	}
	public String getCfName() {
		return cfName;
	}
	public void setCfName(String cfName) {
		this.cfName = cfName;
	}
	public String getCfDescription() {
		return cfDescription;
	}
	public void setCfDescription(String cfDescription) {
		this.cfDescription = cfDescription;
	}
}

package com.lfw.babyshop.entity;

import java.sql.Timestamp;

public class Admin {
	private int adminId; //管理员ID
	private String adminPassword; //管理员密码
	private String adminName; //管理员姓名
	private int adminType; //管理员类型
	private int adminTimes; //管理员访问次数
	private String adminLastLoginIp; //管理员上次登录IP
	private Timestamp adminLastLoginTime; //管理员上次登录时间
	private Timestamp adminCreatedTime; //管理员加入时间
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getAdminType() {
		return adminType;
	}
	public void setAdminType(int adminType) {
		this.adminType = adminType;
	}
	public int getAdminTimes() {
		return adminTimes;
	}
	public void setAdminTimes(int adminTimes) {
		this.adminTimes = adminTimes;
	}
	public String getAdminLastLoginIp() {
		return adminLastLoginIp;
	}
	public void setAdminLastLoginIp(String adminLastLoginIp) {
		this.adminLastLoginIp = adminLastLoginIp;
	}
	public Timestamp getAdminLastLoginTime() {
		return adminLastLoginTime;
	}
	public void setAdminLastLoginTime(Timestamp adminLastLoginTime) {
		this.adminLastLoginTime = adminLastLoginTime;
	}
	public Timestamp getAdminCreatedTime() {
		return adminCreatedTime;
	}
	public void setAdminCreatedTime(Timestamp adminCreatedTime) {
		this.adminCreatedTime = adminCreatedTime;
	}
}

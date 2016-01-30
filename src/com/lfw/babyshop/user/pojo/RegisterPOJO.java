package com.lfw.babyshop.user.pojo;

public class RegisterPOJO {
	private String userId;	//注册表单用户Id
	private String userPassword;	//注册表单用户Id
	private String passwd2;	//注册表单用户Id
	private String userPhone;	//注册表单用户Id
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getPasswd2() {
		return passwd2;
	}
	public void setPasswd2(String passwd2) {
		this.passwd2 = passwd2;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "RegisterPOJO [userId=" + userId + ", userPassword=" + userPassword + ", passwd2=" + passwd2
				+ ", userPhone=" + userPhone + "]";
	}
}

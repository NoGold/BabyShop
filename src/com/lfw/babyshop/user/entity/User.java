package com.lfw.babyshop.user.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
	private String userId; //用户ID
	private String userRealName; //用户真实姓名
	private String userPassword; //用户密码
	private String userNickName; //用户昵称
	private String userGender; //用户性别
	private String userMail; //用户邮箱
	private String userPhone; //用户手机
	private Date userBirth; //用户生日
	private int userPoints; //用户积分
	private String userHeadImg; //用户头像
	private String userLastLoginIp; //用户上次登录IP
	private Timestamp userLastLoginTime; //用户上次登录时间
	private Timestamp userCreatedTime; //用户创建时间
	private String userResidence; //用户居住地
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Date getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}
	public int getUserPoints() {
		return userPoints;
	}
	public void setUserPoints(int userPoints) {
		this.userPoints = userPoints;
	}
	public String getUserHeadImg() {
		return userHeadImg;
	}
	public void setUserHeadImg(String userHeadImg) {
		this.userHeadImg = userHeadImg;
	}
	public String getUserLastLoginIp() {
		return userLastLoginIp;
	}
	public void setUserLastLoginIp(String userLastLoginIp) {
		this.userLastLoginIp = userLastLoginIp;
	}
	public Timestamp getUserLastLoginTime() {
		return userLastLoginTime;
	}
	public void setUserLastLoginTime(Timestamp userLastLoginTime) {
		this.userLastLoginTime = userLastLoginTime;
	}
	public Timestamp getUserCreatedTime() {
		return userCreatedTime;
	}
	public void setUserCreatedTime(Timestamp userCreatedTime) {
		this.userCreatedTime = userCreatedTime;
	}
	public String getUserResidence() {
		return userResidence;
	}
	public void setUserResidence(String userResidence) {
		this.userResidence = userResidence;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userRealName=" + userRealName + ", userPassword=" + userPassword
				+ ", userNickName=" + userNickName + ", userGender=" + userGender + ", userMail=" + userMail
				+ ", userPhone=" + userPhone + ", userBirth=" + userBirth + ", userPoints=" + userPoints
				+ ", userHeadImg=" + userHeadImg + ", userLastLoginIp=" + userLastLoginIp + ", userLastLoginTime="
				+ userLastLoginTime + ", userCreatedTime=" + userCreatedTime + ", userResidence=" + userResidence + "]";
	}
}

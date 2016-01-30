package com.lfw.babyshop.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfw.babyshop.user.dao.UserDAO;
import com.lfw.babyshop.user.entity.User;
import com.lfw.babyshop.user.pojo.RegisterPOJO;
import com.lfw.babyshop.user.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO; 
	@Override
	public User loginCheck(String userId, String userPassword) {
		return userDAO.queryByIdAndPassword(userId, userPassword);
	}
	@Override
	public String register(RegisterPOJO register) {
		String regiResult = "";
		String userId = register.getUserId();
		String userPassword = register.getUserPassword();
		String passwd2 = register.getPasswd2();
		String userPhone = register.getUserPhone();
		if(userPassword.equals(passwd2)) {
			if(userDAO.queryById(userId) == null){
				if(userDAO.queryByPhone(userPhone) == null) {
					if(userDAO.addUser(userId, userPassword, userPhone)){
						regiResult = "注册成功";
					} else {
						regiResult = "注册失败,出现异常";
					}
				} else {
					regiResult = "注册失败,该手机号码已存在";
				}
			} else {
				regiResult = "注册失败,该用户ID已存在";
			}
		} else {
			regiResult = "注册失败,两次输入密码不一致";
		}
		return regiResult;
	}

}

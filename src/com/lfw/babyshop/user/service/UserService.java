package com.lfw.babyshop.user.service;

import com.lfw.babyshop.user.entity.User;
import com.lfw.babyshop.user.pojo.RegisterPOJO;

public interface UserService {
	public User loginCheck(String userId, String userPassword);

	public String register(RegisterPOJO register);
}

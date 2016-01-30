package com.lfw.babyshop.user.dao;

import com.lfw.babyshop.user.entity.User;

public interface UserDAO {
	public User queryByIdAndPassword(String userId, String userPassword);
	public boolean addUser(String userId, String userPassword, String userPhone);
	public User queryById(String userId);
	public User queryByPhone(String userPhone);
}

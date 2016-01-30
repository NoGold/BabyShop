package com.lfw.babyshop.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lfw.babyshop.user.dao.UserDAO;
import com.lfw.babyshop.user.entity.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User queryByIdAndPassword(String userId, String userPassword) {
		User user = null;
		String sql = "select * from baby.user where userId=? and userPassword=?";
		RowMapper<User> rm = BeanPropertyRowMapper.newInstance(User.class);
		List<User> userlist = jdbcTemplate.query(sql, rm, userId, userPassword);
		if(userlist.size() > 0) {
			user = userlist.get(0);
		}
		return user;
	}

	@Override
	public boolean addUser(String userId, String userPassword, String userPhone) {
		boolean flag = false;
		String sql = "insert into baby.user(userId, userPassword, userPhone) values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, userId, userPassword, userPhone);
		if(result > 0)
			flag = true;
		return flag;
	}

	@Override
	public User queryById(String userId) {
		User user = null;
		String sql = "select * from baby.user where userId=?";
		RowMapper<User> rm = BeanPropertyRowMapper.newInstance(User.class);
		List<User> userlist = jdbcTemplate.query(sql, rm, userId);
		if(userlist.size() > 0) {
			user = userlist.get(0);
		}
		return user;
	}

	@Override
	public User queryByPhone(String userPhone) {
		User user = null;
		String sql = "select * from baby.user where userPhone=?";
		RowMapper<User> rm = BeanPropertyRowMapper.newInstance(User.class);
		List<User> userlist = jdbcTemplate.query(sql, rm, userPhone);
		if(userlist.size() > 0) {
			user = userlist.get(0);
		}
		return user;
	}
	
}

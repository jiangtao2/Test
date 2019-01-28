package com.cjdp2p.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjdp2p.mapper.UserMapper;
import com.cjdp2p.pojo.User;
import com.cjdp2p.service.UserService;

/**
 * 作者：蒋滔
 * 描述： 用户业务逻辑实现类
 * 时间：2019年1月25日下午11:07:15
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/** 
	 * @title 获取所有用户
	 * @return List
	 */
	@Override
	public List<User> getUserAll() {
		try {
			return userMapper.getUserAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @title 根据用户编号删除用户
	 * @return int 
	 * */
	@Override
	public int removeById(int id) {
		try {
			return userMapper.removeById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @title 增加用户
	 * @return int
	 * */
	@Override
	public int insertUser(User user) {
		try {
			return userMapper.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @title 根据用户编号编辑用户
	 * @return int
	 * */
	@Override
	public int updateById(User user) {
		try {
			return userMapper.updateById(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}

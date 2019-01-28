package com.cjdp2p.service;

import java.util.List;

import com.cjdp2p.pojo.User;

/**
 * 作者：蒋滔
 * 描述： 用户业务逻辑层接口
 * 时间：2019年1月25日下午11:07:01
 */
public interface UserService {
	
	//获取所有用户
	List<User> getUserAll();
	//根据用户id删除用户
	int removeById(int id);
	//增加用户
	int insertUser(User user);
	//根据用户编号编辑用户
	int updateById(User user);
}

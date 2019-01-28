package com.cjdp2p.mapper;

import java.util.List;

import com.cjdp2p.pojo.User;

/**
 * 作者：蒋滔
 * 描述： 用户持久层接口
 * 时间：2019年1月25日下午11:07:36
 */
public interface UserMapper {
	//获取所有用户
	List<User> getUserAll() throws Exception;
	//根据用户编号删除用户
	int removeById(int id) throws Exception;
	//增加用户
	int insertUser(User user) throws Exception;
	//根据用户编号编辑用户
	int updateById(User user) throws Exception;
	
}

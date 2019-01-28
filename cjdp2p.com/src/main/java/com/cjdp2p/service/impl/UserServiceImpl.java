package com.cjdp2p.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjdp2p.mapper.UserMapper;
import com.cjdp2p.pojo.User;
import com.cjdp2p.service.UserService;

/**
 * ���ߣ�����
 * ������ �û�ҵ���߼�ʵ����
 * ʱ�䣺2019��1��25������11:07:15
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/** 
	 * @title ��ȡ�����û�
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
	 * @title �����û����ɾ���û�
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
	 * @title �����û�
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
	 * @title �����û���ű༭�û�
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

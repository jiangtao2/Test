package com.cjdp2p.service;

import java.util.List;

import com.cjdp2p.pojo.User;

/**
 * ���ߣ�����
 * ������ �û�ҵ���߼���ӿ�
 * ʱ�䣺2019��1��25������11:07:01
 */
public interface UserService {
	
	//��ȡ�����û�
	List<User> getUserAll();
	//�����û�idɾ���û�
	int removeById(int id);
	//�����û�
	int insertUser(User user);
	//�����û���ű༭�û�
	int updateById(User user);
}

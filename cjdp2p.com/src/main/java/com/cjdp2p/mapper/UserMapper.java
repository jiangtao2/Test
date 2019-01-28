package com.cjdp2p.mapper;

import java.util.List;

import com.cjdp2p.pojo.User;

/**
 * ���ߣ�����
 * ������ �û��־ò�ӿ�
 * ʱ�䣺2019��1��25������11:07:36
 */
public interface UserMapper {
	//��ȡ�����û�
	List<User> getUserAll() throws Exception;
	//�����û����ɾ���û�
	int removeById(int id) throws Exception;
	//�����û�
	int insertUser(User user) throws Exception;
	//�����û���ű༭�û�
	int updateById(User user) throws Exception;
	
}

package com.cjdp2p.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjdp2p.pojo.User;
import com.cjdp2p.service.MongodbServer;
import com.cjdp2p.service.RabbitUserSend;
import com.cjdp2p.service.UserService;

/**
 * ���ߣ�����
 * ������ �û����Ʋ�
 * ʱ�䣺2019��1��25������11:06:21
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private RabbitUserSend rabbitUserSend;
	@Autowired
	private MongodbServer mongodbServer;
	
	public static final String SUCCESS = "success";
	public static final String FAILURE = "failure";
	
	/**
	 * 	��������ȡ�����û����ص�ҳ��
	 * @return List
	 */
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	@ResponseBody
	public List<User> getUserAll(){
		List<User> users = userService.getUserAll();
		rabbitUserSend.send();
		return users;
	}
	
	/**
	 * 	�����������û����ɾ���û�
	 * @param id
	 * @return String 
	 */
	@RequestMapping(value="/user",method=RequestMethod.DELETE)
	@ResponseBody
	public String removeById(int id) {
		int removeResult = userService.removeById(id);
		if(removeResult > 0) {
			return SUCCESS;
		}
		return FAILURE;
	}
	
	/**
	 * 	�����������û�
	 * @param user
	 * @return String
	 */
	@RequestMapping(value="/user",method=RequestMethod.POST)
	@ResponseBody
	public String insertUser(User user) {
		int insertResult = userService.insertUser(user);
		if(insertResult > 0) {
			return SUCCESS;
		}
		return FAILURE;
	}
	
	
	/**
	 * 	�����������û���ű༭�û�
	 * @param user
	 * @return String
	 */
	@RequestMapping(value="/user",method=RequestMethod.PUT)
	@ResponseBody
	public String updateById(User user) {
		int updateResult = userService.updateById(user);
		if(updateResult > 0) {
			return SUCCESS;
		}
		return FAILURE;
	}
}

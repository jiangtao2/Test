package com.cjdp2p.pojo;

import java.io.Serializable;

/**
 * 作者：蒋滔
 * 描述： 用户实体类
 * 时间：2019年1月25日下午11:06:30
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;//用户编号
	
	private String name;//用户名称
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

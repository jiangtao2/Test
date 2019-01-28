package com.cjdp2p.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：蒋滔
 * 描述： 
 * 时间：2019年1月27日下午6:39:20
 */
@Component
@FeignClient(value="rabbitserver")
public interface RabbitUserSend {
	
	@RequestMapping("/userSend")
	public void send();
}

package com.cjdp2p.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：蒋滔
 * 描述： 
 * 时间：2019年1月27日下午7:54:17
 */
@Component
@FeignClient("mongodbserver")
public interface MongodbServer {
	@RequestMapping("/getUserAll")
	List<String> getUserAll();
}

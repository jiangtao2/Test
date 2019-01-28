package com.cjdp2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * ���ߣ�����
 * ������ 
 * ʱ�䣺2019��1��26������11:58:42
 */
@EnableAutoConfiguration // ���������ļ���д
//����Eureka���ã����˷���ע�ᵽeurekaע������
@EnableEurekaClient
@SpringBootApplication // ����Spring Boot
//mybatis�ӿ�ɨ��
//开启Feign
@EnableFeignClients
//rest控制器
@RestController

@MapperScan("com.cjdp2p.mapper")
public class Cjdp2pApplication {
	public static void main(String[] args) {
		SpringApplication.run(Cjdp2pApplication.class, args);
	}
}

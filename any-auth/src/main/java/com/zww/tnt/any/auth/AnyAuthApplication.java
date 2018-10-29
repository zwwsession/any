package com.zww.tnt.any.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 *  获取用户信息也是通过这个应用实现
 *         这里既是认证服务器，也是资源服务器
 *         EnableResourceServer
* @author zww
* @email  zwwtnt@yeah.net
* @date 2018/7/19 下午10:46
**/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.zww.tnt.any.auth", "com.zww.tnt.any.common"})
public class AnyAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnyAuthApplication.class, args);
	}
}

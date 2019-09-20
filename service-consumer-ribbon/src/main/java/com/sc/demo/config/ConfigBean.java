package com.sc.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){  //随机
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule(){
		return new RoundRobinRule(); 	//增加方法之后变为轮询策略
	}
}

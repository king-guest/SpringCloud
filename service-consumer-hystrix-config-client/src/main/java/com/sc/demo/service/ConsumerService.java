package com.sc.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sc.demo.entity.User;

/*以后调用service-provider微服务中的方法，只需要调用下面对应的接口既可以了
 * 两种方式：
 * 1：fallbackFactory:实现fallback工厂类
 * 2:自定义fallback类
 * */
@FeignClient(value="service-provider-hystrix",fallbackFactory = ConsumerServiceFallbackFactory.class)
//@FeignClient(value="service-provider",fallback = ConsumerServiceFallback.class)
public interface ConsumerService {

	/*调用接口中的get方法，即可以向service-provider微服务发送/get/{id}请求*/
	@GetMapping(value="/get/{id}")
	public User get(@PathVariable("id") int id);
	
	@PostMapping(value="/add")
	public boolean add(User user);
	
	@GetMapping(value="/getUser/list")
	public List<User> getAll();
}
package com.sc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sc.demo.entity.User;
import com.sc.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public boolean addUser(@RequestBody User user){
		boolean flag = service.addUser(user);
		return flag;
	}
	
	@GetMapping(value="/get/{id}")
	@HystrixCommand(fallbackMethod="hystrixGetUser") //一旦服务调用失败，就调用hystrixGetUser方法
	public User getUser(@PathVariable("id") int id){
		User user = service.getUser(id);
		if(user == null){
			throw new RuntimeException("不存在id=" + id + "对应的用户信息");
		}
		return user;
	}
	
	@GetMapping(value="/getUser/list")
	public List<User> getUsers(){
		List<User> users = service.getUsers();
		return users;
	}
	
	public User hystrixGetUser(@PathVariable("id") int id){
		User user = new User(id, "provider输出信息：不存在该用户", 0);
		return user;
	}
}


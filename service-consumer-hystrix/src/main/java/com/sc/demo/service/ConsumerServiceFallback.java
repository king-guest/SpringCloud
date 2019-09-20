package com.sc.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sc.demo.entity.User;
@Component
public class ConsumerServiceFallback implements ConsumerService{

	@Override
	public User get(int id) {
		User user = new User(id, "consumer输出信息：该用户不存在", 0);
		return user;
	}

	@Override
	public boolean add(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

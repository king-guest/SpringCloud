package com.sc.demo.service;

import java.util.List;

import com.sc.demo.entity.User;

public interface UserService {
	public boolean addUser(User user);

	public User getUser(int id);

	public List<User> getUsers();
}

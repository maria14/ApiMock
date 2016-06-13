package com.retalia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retalia.daos.UserDao;
import com.retalia.models.User;

@Service("userService")
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public User getMe() {
		return userDao.getMe();
		
	}

	public List<User> getFriends() {
		return userDao.getFriends();
	}

	public User getUserById(String id) throws Exception {
		return userDao.getUserByID(id);
	}

}

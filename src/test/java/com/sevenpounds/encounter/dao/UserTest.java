package com.sevenpounds.encounter.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sevenpounds.encounter.entity.User;


public class UserTest extends BaseTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testUserList() {
		List<User> userList = userDao.queryUser();
		System.out.println(userList);
	}

}

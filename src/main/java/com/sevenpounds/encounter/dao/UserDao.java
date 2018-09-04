package com.sevenpounds.encounter.dao;

import java.util.List;

import com.sevenpounds.encounter.entity.User;

public interface UserDao {
//	获取用户列表
	List<User> queryUser();
}

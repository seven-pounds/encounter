package com.sevenpounds.encounter.dao;

import java.util.List;

import com.sevenpounds.encounter.entity.User;

public interface UserDao {
//	获取用户列表
	List<User> queryUser();

//	insert user
	int insertUser(User user);

//	delete user
	int deleteUser(long userId);

	/**
	 * 批量删除区域列表
	 *
	 * @param userIdList
	 * @return
	 */
	int batchDeleteUser(List<Long> userIdList);

//	update username
	int updateUserName(long userId);

//	update password
	int updatePassword(long userId);


}

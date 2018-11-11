package com.sevenpounds.encounter.service.impl;

import com.sevenpounds.encounter.dao.UserDao;
import com.sevenpounds.encounter.dto.UserExecution;
import com.sevenpounds.encounter.entity.User;
import com.sevenpounds.encounter.enums.UserStateEnums;
import com.sevenpounds.encounter.exceptions.UserOperationException;
import com.sevenpounds.encounter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Create by jingzfan on 9/5/2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserExecution getShopList(User shopCondition, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public User getUserById(long userId) {
        return null;
    }

    @Override
    public UserExecution addUser(User user) throws UserOperationException {
        // 空值判断
        if (user == null) {
            return new UserExecution(UserStateEnums.NULL_USER);
        }
            user.setUserType(2);
        //TODO 注册时间
            int effectedNum = userDao.insertUser(user);
            if (effectedNum <= 0) {
                throw new UserOperationException("用户注册失败");
            }
        return new UserExecution(UserStateEnums.SUCCESS,user);
    }

    @Override
    public UserExecution updateUserName(long userId) throws UserOperationException {
        return null;
    }

    @Override
    public UserExecution updateUserPassword(long userId) throws UserOperationException {
        return null;
    }
}

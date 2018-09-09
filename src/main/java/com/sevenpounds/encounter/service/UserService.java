package com.sevenpounds.encounter.service;

import com.sevenpounds.encounter.dto.UserExecution;
import com.sevenpounds.encounter.entity.User;
import com.sevenpounds.encounter.exceptions.UserOperationException;

/**
 * Create by jingzfan on 9/5/2018.
 */
public interface UserService {

    public UserExecution getShopList(User shopCondition, int pageIndex, int pageSize);

    User getUserById(long userId);

    UserExecution addShop(User user) throws UserOperationException;

    UserExecution updateUserName(long userId) throws UserOperationException;

    UserExecution updateUserPassword(long userId) throws UserOperationException;

}

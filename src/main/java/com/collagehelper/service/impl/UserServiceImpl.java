package com.collagehelper.service.impl;

import com.collagehelper.dao.UserDOMapper;
import com.collagehelper.dataobject.UserDO;
import com.collagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Override
    public UserDO getUserByPhone(String phone) {
        return userDOMapper.selectByPrimaryKey(phone);
    }

    @Override
    public void regist(UserDO userDO){
        userDOMapper.insert(userDO);
    }
}

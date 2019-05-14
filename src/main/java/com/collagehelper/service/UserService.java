package com.collagehelper.service;

import com.collagehelper.dataobject.UserDO;

public interface UserService {
    UserDO getUserByPhone(String phone);
    void regist(UserDO userDO);
    void insertFace(String face,String phone);
    UserDO selectByPhoneAndFace(String phone,String face);
}

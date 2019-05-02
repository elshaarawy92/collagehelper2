package com.collagehelper.service;

import com.collagehelper.dataobject.APDO;

import java.util.List;

public interface APService {
    void addAP(APDO apdo);
    List<APDO> getByAssembleId(String assembleId);
    void insert(APDO apdo);
    List<APDO> selectByPhone(String phone);
    void updateByPrimarykey(APDO apdo);
    int updateByPhoneAndAID(String status,String assembleId,String phone);
}

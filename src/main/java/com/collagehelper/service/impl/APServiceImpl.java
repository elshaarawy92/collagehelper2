package com.collagehelper.service.impl;

import com.collagehelper.dao.APDOMapper;
import com.collagehelper.dataobject.APDO;
import com.collagehelper.service.APService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APServiceImpl implements APService {
    @Autowired
    private APDOMapper apdoMapper;

    @Override
    public void addAP(APDO apdo) {
        apdoMapper.insert(apdo);
    }

    @Override
    public List<APDO> getByAssembleId(String assembleId) {
        return apdoMapper.selectByAssembleId(assembleId);
    }

    @Override
    public void insert(APDO apdo) {
        apdoMapper.insert(apdo);
    }

    @Override
    public List<APDO> selectByPhone(String phone) {
        return apdoMapper.selectByPhone(phone);
    }

    @Override
    public void updateByPrimarykey(APDO apdo) {
        apdoMapper.updateByPrimaryKey(apdo);
    }

    @Override
    public int updateByPhoneAndAID(String status, String assembleId, String phone) {
        apdoMapper.updateByPhoneAndAId(status,assembleId,phone);
        return 0;
    }
}

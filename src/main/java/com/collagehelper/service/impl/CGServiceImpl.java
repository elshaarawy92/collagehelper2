package com.collagehelper.service.impl;

import com.collagehelper.dao.CGDOMapper;
import com.collagehelper.dataobject.CGDO;
import com.collagehelper.service.CGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CGServiceImpl implements CGService {
    @Autowired
    private CGDOMapper cgdoMapper;

    @Override
    public void addCollect(CGDO cgdo) {
        cgdoMapper.insert(cgdo);
    }

    @Override
    public void deleteCollect(int id) {
        cgdoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<CGDO> getCollect(String phone) {
        return cgdoMapper.selectByPhone(phone);
    }
}

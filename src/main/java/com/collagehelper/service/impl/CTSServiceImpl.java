package com.collagehelper.service.impl;

import com.collagehelper.dao.CTSDOMapper;
import com.collagehelper.dataobject.CTSDO;
import com.collagehelper.service.CTSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CTSServiceImpl implements CTSService {

    @Autowired
    private CTSDOMapper ctsdoMapper;

    @Override
    public void collectSeller(CTSDO ctsdo) {
        ctsdoMapper.insert(ctsdo);
    }

    @Override
    public List<CTSDO> getSellerByCPhone(String cPhone) {
        return ctsdoMapper.getSellerByCPhone(cPhone);
    }
}

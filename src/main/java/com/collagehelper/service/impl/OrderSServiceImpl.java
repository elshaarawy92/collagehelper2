package com.collagehelper.service.impl;

import com.collagehelper.dao.FormSDOMapper;
import com.collagehelper.dao.OrderSDOMapper;
import com.collagehelper.dataobject.FormSDO;
import com.collagehelper.dataobject.OrderSDO;
import com.collagehelper.service.OrderSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSServiceImpl implements OrderSService {

    @Autowired
    private FormSDOMapper formSDOMapper;

    @Override
    public void addToDB(FormSDO formSDO) {
        formSDOMapper.insert(formSDO);
    }

    @Override
    public List<FormSDO> selectByCustomerPhone(String customerPhone) {
        return formSDOMapper.selectByCustomerPhone(customerPhone);
    }

    @Override
    public List<FormSDO> selectBySellerPhone(String sellerPhone) {
        return formSDOMapper.selectBySellerPhone(sellerPhone);
    }

    @Override
    public List<FormSDO> selectByStatus(String status) {
        return formSDOMapper.selectByStatus(status);
    }

    @Override
    public int updateByOrderId(String orderId, String status) {
        formSDOMapper.updateByOrderId(orderId,status);
        return 0;
    }
}

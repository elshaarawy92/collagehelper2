package com.collagehelper.service.impl;

import com.collagehelper.dao.FormDOMapper;
import com.collagehelper.dao.OrderDOMapper;
import com.collagehelper.dataobject.FormDO;
import com.collagehelper.dataobject.FormSDO;
import com.collagehelper.dataobject.OrderDO;
import com.collagehelper.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private FormDOMapper formDOMapper;

    @Override
    public void addToDB(FormDO formDO) {
        formDOMapper.insert(formDO);
    }

    @Override
    public List<FormDO> selectByCustomerPhone(String customerPhone) {
        return formDOMapper.selectByCustomerPhone(customerPhone);
    }

    @Override
    public List<FormDO> selectBySellerPhone(String sellerPhone) {
        return formDOMapper.selectBySellerPhone(sellerPhone);
    }

    @Override
    public List<FormDO> selectByStatus(String status,String customerPhone) {
        return formDOMapper.selectByStatus(status,customerPhone);
    }

    @Override
    public int updateByOrderId(String orderId, String status) {
        formDOMapper.updateByOrderId(orderId,status);
        return 0;
    }
}

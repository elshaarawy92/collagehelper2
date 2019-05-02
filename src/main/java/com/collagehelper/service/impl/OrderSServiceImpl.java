package com.collagehelper.service.impl;

import com.collagehelper.dao.OrderSDOMapper;
import com.collagehelper.dataobject.OrderSDO;
import com.collagehelper.service.OrderSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSServiceImpl implements OrderSService {

    @Autowired
    private OrderSDOMapper orderSDOMapper;

    @Override
    public void addToDB(OrderSDO orderSDO) {
        orderSDOMapper.insert(orderSDO);
    }

    @Override
    public List<OrderSDO> selectByCustomerPhone(String customerPhone) {
        return orderSDOMapper.selectByCustomerPhone(customerPhone);
    }

    @Override
    public List<OrderSDO> selectBySellerPhone(String sellerPhone) {
        return orderSDOMapper.selectBySellerPhone(sellerPhone);
    }
}

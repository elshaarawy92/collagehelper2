package com.collagehelper.service.impl;

import com.collagehelper.dao.OrderDOMapper;
import com.collagehelper.dataobject.OrderDO;
import com.collagehelper.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDOMapper orderDOMapper;

    @Override
    public void addToDB(OrderDO orderDO) {
        orderDOMapper.insert(orderDO);
    }

    @Override
    public List<OrderDO> selectByCustomerPhone(String customerPhone) {
        return orderDOMapper.selectByCustomerPhone(customerPhone);
    }

    @Override
    public List<OrderDO> selectBySellerPhone(String sellerPhone) {
        return orderDOMapper.selectBySellerPhone(sellerPhone);
    }
}

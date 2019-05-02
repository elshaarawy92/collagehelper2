package com.collagehelper.service;

import com.collagehelper.dataobject.OrderDO;

import java.util.List;

public interface OrderService {

    void addToDB(OrderDO orderDO);

    List<OrderDO> selectByCustomerPhone(String customerPhone);

    List<OrderDO> selectBySellerPhone(String sellerPhone);
}

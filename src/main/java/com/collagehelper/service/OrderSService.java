package com.collagehelper.service;

import com.collagehelper.dataobject.OrderSDO;

import java.util.List;

public interface OrderSService {

    void addToDB(OrderSDO orderSDO);

    List<OrderSDO> selectByCustomerPhone(String customerPhone);

    List<OrderSDO> selectBySellerPhone(String sellerPhone);
}

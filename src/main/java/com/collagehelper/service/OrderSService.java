package com.collagehelper.service;

import com.collagehelper.dataobject.FormSDO;

import java.util.List;

public interface OrderSService {

    void addToDB(FormSDO formSDO);

    List<FormSDO> selectByCustomerPhone(String customerPhone);

    List<FormSDO> selectBySellerPhone(String sellerPhone);

    List<FormSDO> selectByStatus(String status);

    int updateByOrderId(String orderId,String status);
}

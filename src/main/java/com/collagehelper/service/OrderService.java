package com.collagehelper.service;

import com.collagehelper.dataobject.FormDO;

import java.util.List;

public interface OrderService {

    void addToDB(FormDO formDO);

    List<FormDO> selectByCustomerPhone(String customerPhone);

    List<FormDO> selectBySellerPhone(String sellerPhone);

    List<FormDO> selectByStatus(String status,String customerPhone);

    int updateByOrderId(String orderId,String status);
}

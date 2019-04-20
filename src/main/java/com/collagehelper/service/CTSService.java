package com.collagehelper.service;

import com.collagehelper.dataobject.CTSDO;

import java.util.List;

public interface CTSService {
    void collectSeller(CTSDO ctsdo);
    List<CTSDO> getSellerByCPhone(String cPhone);
}

package com.collagehelper.service;

import com.collagehelper.dataobject.CGDO;

import java.util.List;

public interface CGService {
    void addCollect(CGDO cgdo);
    void deleteCollect(int id);
    List<CGDO> getCollect(String phone);
}

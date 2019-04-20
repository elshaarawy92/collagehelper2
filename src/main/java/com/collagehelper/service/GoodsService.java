package com.collagehelper.service;

import com.collagehelper.dataobject.GoodsDO;

import java.util.List;

public interface GoodsService {
    void addGoods(GoodsDO goodsDO);
    List<GoodsDO> getGoodsByPhone(String phone);
    void deleteGoods(Integer id);
    void updateGoods(GoodsDO goodsDO);
    GoodsDO getGoodsById(int id);
    List<GoodsDO> getGoodsByName(String name);
}

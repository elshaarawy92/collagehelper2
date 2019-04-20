package com.collagehelper.service.impl;

import com.collagehelper.dao.GoodsDOMapper;
import com.collagehelper.dataobject.GoodsDO;
import com.collagehelper.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDOMapper goodsDOMapper;

    @Override
    public void addGoods(GoodsDO goodsDO) {
        goodsDOMapper.insert(goodsDO);
    }

    @Override
    public List<GoodsDO> getGoodsByPhone(String phone) {
        return goodsDOMapper.selectByPhone(phone);
    }

    @Override
    public void deleteGoods(Integer id) {
        goodsDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateGoods(GoodsDO goodsDO) {
        goodsDOMapper.updateByPrimaryKey(goodsDO);
    }

    @Override
    public GoodsDO getGoodsById(int id) {
        return goodsDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsDO> getGoodsByName(String name) {
        return goodsDOMapper.getGoodsByName(name);
    }
}

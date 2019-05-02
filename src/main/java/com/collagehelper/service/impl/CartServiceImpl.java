package com.collagehelper.service.impl;

import com.collagehelper.dao.CartDOMapper;
import com.collagehelper.dataobject.CartDO;
import com.collagehelper.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDOMapper cartDOMapper;

    @Override
    public void addToCart(CartDO cartDO) {
        cartDOMapper.insert(cartDO);
    }

    @Override
    public List<CartDO> getFromCart(String phone) {
        return cartDOMapper.selectByPhone(phone);
    }

    @Override
    public void delete(int id) {
        cartDOMapper.deleteByPrimaryKey(id);
    }
}

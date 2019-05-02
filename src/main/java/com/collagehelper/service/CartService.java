package com.collagehelper.service;

import com.collagehelper.dataobject.CartDO;

import java.util.List;

public interface CartService {
    void addToCart(CartDO cartDO);
    List<CartDO> getFromCart(String phone);
    void delete(int id);
}

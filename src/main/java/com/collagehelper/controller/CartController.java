package com.collagehelper.controller;

import com.collagehelper.dataobject.CartDO;
import com.collagehelper.response.CommonReturnType;
import com.collagehelper.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cart")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/add")
    @ResponseBody
    public void collectSeller(@RequestParam("phone")String phone,
                              @RequestParam("goods_id")int goodsId,
                              @RequestParam("goods_count")int goodsCount){
        CartDO cartDO = new CartDO();
        cartDO.setPhone(phone);
        cartDO.setGoodsId(goodsId);
        cartDO.setGoodsCount(goodsCount);
        cartService.addToCart(cartDO);
    }

    @GetMapping("/get")
    @ResponseBody
    public CommonReturnType getFromCart(@RequestParam("phone")String phone){
        List<CartDO> list = cartService.getFromCart(phone);
        if (list.size() == 0){
            return CommonReturnType.create("failure",list);
        }else {
            return CommonReturnType.create(list);
        }
    }

    @GetMapping("/delete")
    @ResponseBody
    public void delete(@RequestParam("id")int id){
        cartService.delete(id);
    }
}

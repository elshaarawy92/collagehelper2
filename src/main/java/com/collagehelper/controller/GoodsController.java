package com.collagehelper.controller;

import com.collagehelper.dataobject.GoodsDO;
import com.collagehelper.response.CommonReturnType;
import com.collagehelper.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/goods")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Transactional
    @PostMapping(value = "/add_goods",consumes = "multipart/form-data")
    @ResponseBody
    public void addGoods(@RequestParam("phone")String phone,
                         @RequestParam("goods_name")String goodsName,
                         @RequestParam("goods_price")String goodsPrice,
                         @RequestParam("goods_des")String description,
                         @RequestParam("goods_image")MultipartFile image){
        GoodsDO goodsDO = new GoodsDO();
        goodsDO.setPhone(phone);
        goodsDO.setGoodsName(goodsName);
        goodsDO.setGoodsPrice(goodsPrice);
        goodsDO.setGoodsDes(description);
        String goodsAddress = "D:/aaaa/head/" + phone + goodsName + ".png";
        try {
            image.transferTo(new File(goodsAddress));
            String goodsUrl = "http://192.168.43.88:8080/image/" + phone + goodsName + ".png";
            goodsDO.setGoodsImg(goodsUrl);
            goodsService.addGoods(goodsDO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/get_goods")
    @ResponseBody
    public CommonReturnType getGoodsByPhone(@RequestParam("phone")String phone){
        List<GoodsDO> goodsDO = goodsService.getGoodsByPhone(phone);
        if (goodsDO == null){
            return CommonReturnType.create("failure",null);
        }else {
            return CommonReturnType.create(goodsDO);
        }
    }

    @Transactional
    @PostMapping(value = "/delete_goods",consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public void deleteGoods(@RequestParam("id") int id){
        goodsService.deleteGoods(id);
    }

    @Transactional
    @PostMapping(value = "/update_goods",consumes = "multipart/form-data")
    @ResponseBody
    public void updateGoods(@RequestParam("id")Integer id,
                            @RequestParam("phone")String phone,
                            @RequestParam("goods_name")String goodsName,
                            @RequestParam("goods_price")String goodsPrice,
                            @RequestParam("goods_des")String description,
                            @RequestParam("goods_image")MultipartFile image){
        GoodsDO goodsDO = new GoodsDO();
        goodsDO.setGoodsId(id);
        goodsDO.setPhone(phone);
        goodsDO.setGoodsName(goodsName);
        goodsDO.setGoodsDes(description);
        goodsDO.setGoodsPrice(goodsPrice);
        String goodsAddress = "D:/aaaa/head/" + phone + goodsName + ".png";
        try {
            image.transferTo(new File(goodsAddress));
            String goodsUrl = "http://192.168.43.88:8080/image/" + phone + goodsName + ".png";
            goodsDO.setGoodsImg(goodsUrl);
            goodsService.updateGoods(goodsDO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/get_goods_by_id")
    @ResponseBody
    public CommonReturnType getGoodsById(@RequestParam("id")Integer id){
        GoodsDO goodsDO = goodsService.getGoodsById(id);
        if (goodsDO == null){
            return CommonReturnType.create("failure",null);
        }else {
            return CommonReturnType.create(goodsDO);
        }
    }

    @GetMapping("/get_goods_by_name")
    @ResponseBody
    public CommonReturnType getGoodsByName(@RequestParam("name")String name){
        List<GoodsDO> list = goodsService.getGoodsByName("%" + name + "%");
        if (list == null){
            return CommonReturnType.create("failure",null);
        }else {
            return CommonReturnType.create(list);
        }
    }
}

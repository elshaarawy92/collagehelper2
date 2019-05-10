package com.collagehelper.controller;

import com.collagehelper.dataobject.FormDO;
import com.collagehelper.dataobject.FormSDO;
import com.collagehelper.dataobject.OrderDO;
import com.collagehelper.dataobject.OrderSDO;
import com.collagehelper.service.OrderSService;
import com.collagehelper.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderSService orderSService;

    @GetMapping("/add")
    @ResponseBody
    public void addToDB(@RequestParam("customer_phone")String customerPhone,
                        @RequestParam("seller_phone")String sellerPhone,
                        @RequestParam("order_id")String orderId,
                        @RequestParam("time")String time,
                        @RequestParam("money")String money,
                        @RequestParam("goods_id")int goodsId,
                        @RequestParam("goods_count")int goodsCount,
                        @RequestParam("status")String status){
        FormDO orderDO = new FormDO();
        orderDO.setCustomerPhone(customerPhone);
        orderDO.setSellerPhone(sellerPhone);
        orderDO.setOrderId(orderId);
        orderDO.setTime(time);
        orderDO.setMoney(money);
        orderDO.setGoodsId(goodsId);
        orderDO.setGoodsCount(goodsCount);
        orderDO.setStatus(status);
        FormSDO orderSDO = new FormSDO();
        orderSDO.setCustomerPhone(customerPhone);
        orderSDO.setSellerPhone(sellerPhone);
        orderSDO.setOrderId(orderId);
        orderSDO.setTime(time);
        orderSDO.setMoney(money);
        orderSDO.setGoodsId(goodsId);
        orderSDO.setGoodsCount(goodsCount);
        orderSDO.setStatus(status);
        orderService.addToDB(orderDO);
        orderSService.addToDB(orderSDO);
    }

    @GetMapping("/sbcp")
    @ResponseBody
    public List<FormDO> selectByCustomerPhone(@RequestParam("customer_phone")String customerPhone){
        List<FormDO> list = orderService.selectByCustomerPhone(customerPhone);
        if (list.size() == 0){
            return null;
        }else {
            return list;
        }
    }

    @GetMapping("/sbsp")
    @ResponseBody
    public List<FormSDO> selectBySellerPhone(@RequestParam("seller_phone")String sellerPhone){
        List<FormSDO> list = orderSService.selectBySellerPhone(sellerPhone);
        if (list.size() == 0){
            return null;
        }else {
            return list;
        }
    }

    @GetMapping("/sbcs")
    @ResponseBody
    public List<FormDO> selectByCustomerStatus(@RequestParam("status")String status,
                                               @RequestParam("customer_phone")String customerPhone){
        return orderService.selectByStatus(status,customerPhone);
    }

    @GetMapping("/sbss")
    @ResponseBody
    public List<FormSDO> selectBySellerStatus(@RequestParam("status")String status){
        return orderSService.selectByStatus(status);
    }

    @GetMapping("/update")
    @ResponseBody
    public void updateByOrderId(@RequestParam("order_id")String orderId,
                                @RequestParam("status")String status){
        orderService.updateByOrderId(orderId,status);
        orderSService.updateByOrderId(orderId,status);
    }
}

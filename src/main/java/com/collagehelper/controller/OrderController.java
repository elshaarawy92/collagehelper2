package com.collagehelper.controller;

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
                        @RequestParam("goods_count")int goodsCount){
        OrderDO orderDO = new OrderDO();
        orderDO.setCustomerPhone(customerPhone);
        orderDO.setSellerPhone(sellerPhone);
        orderDO.setOrderId(orderId);
        orderDO.setTime(time);
        orderDO.setMoney(money);
        orderDO.setGoodsId(goodsId);
        orderDO.setGoodsCount(goodsCount);
        OrderSDO orderSDO = new OrderSDO();
        orderSDO.setCustomerPhone(customerPhone);
        orderSDO.setSellerPhone(sellerPhone);
        orderSDO.setOrderId(orderId);
        orderSDO.setTime(time);
        orderSDO.setMoney(money);
        orderSDO.setGoodsId(goodsId);
        orderSDO.setGoodsCount(goodsCount);
        orderService.addToDB(orderDO);
        orderSService.addToDB(orderSDO);
    }

    @GetMapping("/sbcp")
    @ResponseBody
    public List<OrderDO> selectByCustomerPhone(@RequestParam("customer_phone")String customerPhone){
        List<OrderDO> list = orderService.selectByCustomerPhone(customerPhone);
        if (list.size() == 0){
            return null;
        }else {
            return list;
        }
    }

    @GetMapping("/sbsp")
    @ResponseBody
    public List<OrderSDO> selectBySellerPhone(@RequestParam("seller_phone")String sellerPhone){
        List<OrderSDO> list = orderSService.selectBySellerPhone(sellerPhone);
        if (list.size() == 0){
            return null;
        }else {
            return list;
        }
    }
}

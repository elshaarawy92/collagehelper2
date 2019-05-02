package com.collagehelper.controller;

import com.collagehelper.dataobject.APDO;
import com.collagehelper.dataobject.AssembleDO;
import com.collagehelper.service.APService;
import com.collagehelper.service.AssembleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/assemble")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class AssembleController {
    @Autowired
    private AssembleService assembleService;

    @Autowired
    private APService apService;

    @GetMapping("/add")
    @ResponseBody
    public void addAssemble(@RequestParam("customer_phone")String customerPhone,
                            @RequestParam("seller_phone")String sellerPhone,
                            @RequestParam("assemble_id")String assembleId,
                            @RequestParam("time")String time,
                            @RequestParam("money")String money,
                            @RequestParam("goods_id")int goodsId,
                            @RequestParam("goods_count")int goodsCount){
        AssembleDO assembleDO = new AssembleDO();
        APDO apdo = new APDO();
        assembleDO.setCustomerPhone(customerPhone);
        assembleDO.setSellerPhone(sellerPhone);
        assembleDO.setAssembleId(assembleId);
        assembleDO.setTime(time);
        assembleDO.setMoney(money);
        assembleDO.setGoodsId(goodsId);
        assembleDO.setGoodsCount(goodsCount);
        assembleDO.setStatus("未完成");
        apdo.setPhone(customerPhone);
        apdo.setAssembleId(assembleId);
        apdo.setStatus("未支付");
        assembleService.addAssemble(assembleDO);
        apService.addAP(apdo);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<AssembleDO> getAssemble(){
        List<AssembleDO> list = assembleService.getAll();
        if (list.size() == 0){
            return null;
        }else {
            return list;
        }
    }

    @GetMapping("/get_by_aid")
    @ResponseBody
    public List<AssembleDO> getByAssembleId(@RequestParam("assemble_id")String assembleId){
        List<AssembleDO> list = assembleService.getByAssembleId(assembleId);
        if (list.size() == 0){
            return null;
        }else {
            return list;
        }
    }
}

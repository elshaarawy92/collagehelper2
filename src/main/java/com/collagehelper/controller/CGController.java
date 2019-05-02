package com.collagehelper.controller;

import com.collagehelper.dataobject.CGDO;
import com.collagehelper.service.CGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cg")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class CGController {
    @Autowired
    private CGService cgService;

    @GetMapping("/add")
    @ResponseBody
    public void add(@RequestParam("phone")String phone,
                    @RequestParam("goods_id")int goodsId){
        CGDO cgdo = new CGDO();
        cgdo.setPhone(phone);
        cgdo.setGoodsId(goodsId);
        cgService.addCollect(cgdo);
    }

    @GetMapping("/delete")
    @ResponseBody
    public void delete(@RequestParam("id")int id){
        cgService.deleteCollect(id);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<CGDO> get(@RequestParam("phone")String phone){
        return cgService.getCollect(phone);
    }
}

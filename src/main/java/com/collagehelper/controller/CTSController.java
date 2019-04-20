package com.collagehelper.controller;

import com.collagehelper.dataobject.CTSDO;
import com.collagehelper.response.CommonReturnType;
import com.collagehelper.service.CTSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cts")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class CTSController {

    @Autowired
    private CTSService ctsService;

    @GetMapping("/collect_seller")
    @ResponseBody
    public void collectSeller(@RequestParam("customer_phone")String customerPhone,
                              @RequestParam("seller_phone")String sellerPhone){
        CTSDO ctsdo = new CTSDO();
        ctsdo.setCustomerPhone(customerPhone);
        ctsdo.setSellerPhone(sellerPhone);
        ctsService.collectSeller(ctsdo);
    }

    @GetMapping("/get_seller")
    @ResponseBody
    public CommonReturnType getSellerByCPhone(@RequestParam("customer_phone")String cPhone){
        List<CTSDO> list = ctsService.getSellerByCPhone(cPhone);
        if (list == null){
            return CommonReturnType.create("failure",null);
        }else {
            return CommonReturnType.create(list);
        }
    }
}

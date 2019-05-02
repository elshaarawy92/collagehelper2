package com.collagehelper.controller;

import com.collagehelper.dataobject.APDO;
import com.collagehelper.service.APService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ap")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class APController {
    @Autowired
    private APService apService;

    @GetMapping("/get")
    @ResponseBody
    public List<APDO> getByAssembleId(@RequestParam("assemble_id")String assembleId){
        List<APDO> list = apService.getByAssembleId(assembleId);
        return list;
    }

    @GetMapping("/add")
    @ResponseBody
    public boolean add(@RequestParam("assemble_id")String assembleId,@RequestParam("phone")String phone){
        List<APDO> list = apService.getByAssembleId(assembleId);
        boolean exist = false;
        for (int i = 0; i < list.size(); i++){
            if (phone.equals(list.get(i).getPhone())){
                exist = true;
                break;
            }
        }
        if (!exist){
            APDO apdo = new APDO();
            apdo.setStatus("未支付");
            apdo.setPhone(phone);
            apdo.setAssembleId(assembleId);
            apService.addAP(apdo);
        }
        return exist;
    }

    @GetMapping("/get_by_phone")
    @ResponseBody
    public List<APDO> getByPhone(@RequestParam("phone")String phone){
        List<APDO> list = apService.selectByPhone(phone);
        return list;
    }

    @GetMapping("/update")
    @ResponseBody
    public void updateByPrimaryKey(@RequestParam("assemble_id")String assembleId,
                                   @RequestParam("phone")String phone,
                                   @RequestParam("status")String status){
        apService.updateByPhoneAndAID(status,assembleId,phone);
    }
}

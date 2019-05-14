package com.collagehelper.controller;

import com.collagehelper.dataobject.UserDO;
import com.collagehelper.response.CommonReturnType;
import com.collagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/user")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    @ResponseBody
    public CommonReturnType getUser(@RequestParam(name = "phone")String phone){
        //调用service服务获取对应id的用户对象并返回给前端
        UserDO userDO = userService.getUserByPhone(phone);
        if (userDO == null){
            return CommonReturnType.create("failure",null);
        }else {
            return CommonReturnType.create(userDO);
        }
    }

    @Transactional
    @RequestMapping(value = "/regist",method = RequestMethod.POST,consumes = {"multipart/form-data","application/x-www-form-urlencoded"})
    @ResponseBody
    public int regist(@RequestParam("phone")String phone,
                      @RequestParam("name")String name,
                      @RequestParam("type")String type,
                      @RequestParam("pwd")String pwd,
                      @RequestParam("head")MultipartFile head){
        UserDO userDO = new UserDO();
        userDO.setPhone(phone);
        userDO.setName(name);
        userDO.setPassword(pwd);
        userDO.setType(type);
        try {
            String headAddress = "D:/aaaa/head/" + phone + "_head.png";
            head.transferTo(new File(headAddress));
            String headUrl = "http://192.168.43.88:8080/image/" + phone + "_head.png";
            userDO.setHead(headUrl);
            userService.regist(userDO);
            return 1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @GetMapping("/face")
    @ResponseBody
    public void insertFace(@RequestParam("phone")String phone,
                           @RequestParam("face")String face){
        userService.insertFace(face,phone);
    }

    @GetMapping("/sbpf")
    @ResponseBody
    public UserDO selectByPhoneAndFace(@RequestParam("phone")String phone,
                                       @RequestParam("face")String face){
        return userService.selectByPhoneAndFace(phone,face);
    }
}

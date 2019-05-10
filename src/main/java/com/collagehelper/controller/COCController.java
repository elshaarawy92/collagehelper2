package com.collagehelper.controller;

import com.collagehelper.dataobject.COCDO;
import com.collagehelper.service.COCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/coc")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class COCController {
    @Autowired
    private COCService cocService;

    @GetMapping("/add")
    @ResponseBody
    public void add(@RequestParam("comment_id")int commentId,
                    @RequestParam("comment")String comment,
                    @RequestParam("time")String time,
                    @RequestParam("phone")String phone){
        COCDO cocdo = new COCDO();
        cocdo.setComment(comment);
        cocdo.setCommentId(commentId);
        cocdo.setPhone(phone);
        cocdo.setTime(time);
        cocService.add(cocdo);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<COCDO> get(@RequestParam("comment_id")int commentId){
        return cocService.selectByCommentId(commentId);
    }
}

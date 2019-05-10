package com.collagehelper.controller;

import com.collagehelper.dataobject.CommentDO;
import com.collagehelper.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comment")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/add")
    @ResponseBody
    public void addComment(@RequestParam("comment")String comment,
                           @RequestParam("phone")String phone,
                           @RequestParam("goods_id")int goodsId,
                           @RequestParam("time")String time){
        CommentDO commentDO = new CommentDO();
        commentDO.setComment(comment);
        commentDO.setGoodsId(goodsId);
        commentDO.setPhone(phone);
        commentDO.setTime(time);
        commentService.insert(commentDO);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<CommentDO> getComment(@RequestParam("goods_id")int goodsId){
        return commentService.selectByGoodsId(goodsId);
    }
}

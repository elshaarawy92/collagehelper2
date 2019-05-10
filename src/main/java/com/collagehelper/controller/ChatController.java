package com.collagehelper.controller;

import com.collagehelper.dataobject.ChatDO;
import com.collagehelper.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chat")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping("/add")
    @ResponseBody
    public void add(@RequestParam("customer_phone")String customerPhone,
                    @RequestParam("seller_phone")String sellerPhone,
                    @RequestParam("message")String message,
                    @RequestParam("time")String time,
                    @RequestParam("start")String start){
        ChatDO chatDO = new ChatDO();
        chatDO.setCustomerPhone(customerPhone);
        chatDO.setSellerPhone(sellerPhone);
        chatDO.setMessage(message);
        chatDO.setTime(time);
        chatDO.setStart(start);
        chatService.add(chatDO);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<ChatDO> get(@RequestParam("customer_phone")String customerPhone,
                            @RequestParam("seller_phone")String sellerPhone){
        System.out.println(customerPhone + " " + sellerPhone);
        return chatService.get(customerPhone,sellerPhone);
    }

    @GetMapping("/get_cphone")
    @ResponseBody
    public List<ChatDO> getByCPhone(@RequestParam("customer_phone")String customerPhone){
        return chatService.getByCPhone(customerPhone);
    }

    @GetMapping("/get_sphone")
    @ResponseBody
    public List<ChatDO> getBySPhone(@RequestParam("seller_phone")String sellerPhone){
        return chatService.getBySPhone(sellerPhone);
    }
}

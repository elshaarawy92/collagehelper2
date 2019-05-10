package com.collagehelper.service.impl;

import com.collagehelper.dao.ChatDOMapper;
import com.collagehelper.dataobject.ChatDO;
import com.collagehelper.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatDOMapper chatDOMapper;

    @Override
    public void add(ChatDO chatDO) {
        chatDOMapper.insert(chatDO);
    }

    @Override
    public List<ChatDO> get(String customerPhone, String sellerPhone) {
        return chatDOMapper.selectByCPAndSP(customerPhone,sellerPhone);
    }

    @Override
    public List<ChatDO> getByCPhone(String customerPhone) {
        return chatDOMapper.selectByCPhone(customerPhone);
    }

    @Override
    public List<ChatDO> getBySPhone(String sellerPhone) {
        return chatDOMapper.selectBySPhone(sellerPhone);
    }
}

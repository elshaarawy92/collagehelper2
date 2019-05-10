package com.collagehelper.service;

import com.collagehelper.dataobject.ChatDO;

import java.util.List;

public interface ChatService {
    void add(ChatDO chatDO);
    List<ChatDO> get(String customerPhone, String sellerPhone);
    List<ChatDO> getByCPhone(String customerPhone);
    List<ChatDO> getBySPhone(String sellerPhone);
}

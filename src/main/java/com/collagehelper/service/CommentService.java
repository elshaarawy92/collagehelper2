package com.collagehelper.service;

import com.collagehelper.dataobject.CommentDO;

import java.util.List;

public interface CommentService {
    List<CommentDO> selectByGoodsId(int goodsId);
    void insert(CommentDO commentDO);
}

package com.collagehelper.service.impl;

import com.collagehelper.dao.CommentDOMapper;
import com.collagehelper.dataobject.CommentDO;
import com.collagehelper.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDOMapper commentDOMapper;

    @Override
    public List<CommentDO> selectByGoodsId(int goodsId) {
        return commentDOMapper.selectByGoodsId(goodsId);
    }

    @Override
    public void insert(CommentDO commentDO) {
        commentDOMapper.insert(commentDO);
    }
}

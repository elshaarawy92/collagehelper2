package com.collagehelper.service.impl;

import com.collagehelper.dao.COCDOMapper;
import com.collagehelper.dataobject.COCDO;
import com.collagehelper.service.COCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class COCServiceImpl implements COCService {
    @Autowired
    private COCDOMapper cocdoMapper;

    @Override
    public List<COCDO> selectByCommentId(int commentId) {
        return cocdoMapper.selectByCommentId(commentId);
    }

    @Override
    public void add(COCDO cocdo) {
        cocdoMapper.insert(cocdo);
    }
}

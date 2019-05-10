package com.collagehelper.service;

import com.collagehelper.dataobject.COCDO;

import java.util.List;

public interface COCService {
    List<COCDO> selectByCommentId(int commentId);
    void add(COCDO cocdo);
}

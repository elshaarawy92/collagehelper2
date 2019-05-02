package com.collagehelper.service;

import com.collagehelper.dataobject.AssembleDO;

import java.util.List;

public interface AssembleService {
    void addAssemble(AssembleDO assembleDO);

    List<AssembleDO> getAll();

    List<AssembleDO> getByAssembleId(String assembleId);
}

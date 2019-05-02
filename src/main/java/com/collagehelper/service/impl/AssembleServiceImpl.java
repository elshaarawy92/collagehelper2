package com.collagehelper.service.impl;

import com.collagehelper.dao.AssembleDOMapper;
import com.collagehelper.dataobject.AssembleDO;
import com.collagehelper.service.AssembleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssembleServiceImpl implements AssembleService {
    @Autowired
    private AssembleDOMapper assembleDOMapper;

    @Override
    public void addAssemble(AssembleDO assembleDO) {
        assembleDOMapper.insert(assembleDO);
    }

    @Override
    public List<AssembleDO> getAll() {
        return assembleDOMapper.selectAll();
    }

    @Override
    public List<AssembleDO> getByAssembleId(String assembleId) {
        return assembleDOMapper.selectByAssembleId(assembleId);
    }
}

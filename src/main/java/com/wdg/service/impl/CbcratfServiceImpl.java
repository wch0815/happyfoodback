package com.wdg.service.impl;

import com.wdg.dao.ICbcratfDao;
import com.wdg.pojo.Cbcratf;
import com.wdg.service.ICbcratfService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CbcratfServiceImpl implements ICbcratfService {

    @Resource
    private ICbcratfDao cbcratfDao;

    @Override
    public List<Cbcratf> getAllCbcratf() {
        return cbcratfDao.getAllCbcratf();
    }

    @Override
    public boolean saveCbcratf(Cbcratf cbcratf) {
        return cbcratfDao.saveCbcratf(cbcratf) > 0;
    }

    @Override
    public boolean updateCbcratf(Cbcratf cbcratf) {
        return cbcratfDao.updateCbcratf(cbcratf) > 0;
    }

    @Override
    public boolean deleteCbcratfByUid(int cbcid) {
        return cbcratfDao.deleteCbcratfByUid(cbcid) > 0;
    }

}

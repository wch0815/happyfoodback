package com.wdg.service.impl;

import com.wdg.dao.IAddrDao;
import com.wdg.pojo.Addr;
import com.wdg.service.IAddrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddrServiceImpl implements IAddrService {

    @Resource
    private IAddrDao addrDao;


    @Override
    public List<Addr> getAllAddr() {
        return addrDao.getAllAddr();
    }
}

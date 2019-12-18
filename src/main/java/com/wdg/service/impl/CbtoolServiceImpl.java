package com.wdg.service.impl;

import com.wdg.dao.ICbtoolDao;
import com.wdg.pojo.Cbtool;
import com.wdg.service.ICbtoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CbtoolServiceImpl implements ICbtoolService {

    @Resource
    private ICbtoolDao cbtoolDao;

    @Override
    public List<Cbtool> getAllCbtool() {
        return cbtoolDao.getAllCbtool();
    }

    @Override
    public boolean saveCbtool(Cbtool cbtool) {
        return cbtoolDao.saveCbtool(cbtool) > 0;
    }

    @Override
    public boolean updateCbtool(Cbtool cbtool) {
        return cbtoolDao.updateCbtool(cbtool) > 0;
    }

    @Override
    public boolean deleterCbtoolByCbtoid(int cbtoid) {
        return cbtoolDao.deleteCbtoolByCbtoid(cbtoid) > 0;
    }
}

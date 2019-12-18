package com.wdg.service.impl;

import com.wdg.dao.ICbtasteDao;
import com.wdg.pojo.Cbtaste;
import com.wdg.service.ICbtasteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CbtasteServiceImpl implements ICbtasteService {

    @Resource
    private ICbtasteDao cbtasteDao;

    @Override
    public List<Cbtaste> getAllCbtaste() {
        return cbtasteDao.getAllCbtaste();
    }

    @Override
    public boolean saveCbtaste(Cbtaste cbtaste) {
        return cbtasteDao.saveCbtaste(cbtaste) > 0;
    }

    @Override
    public boolean updateCbtaste(Cbtaste cbtaste) {
        return cbtasteDao.updateCbtaste(cbtaste) > 0;
    }

    @Override
    public boolean deleteCbtasteByCbtaid(int cbtaid) {
        return cbtasteDao.dalateCbtasteById(cbtaid) > 0;
    }
}

package com.wdg.service.impl;

import com.wdg.dao.ICbdifficultyDao;
import com.wdg.pojo.Cbdifficulty;
import com.wdg.service.ICbdifficultyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CbdifficultyServiceImpl implements ICbdifficultyService {


    @Resource
    private ICbdifficultyDao cbdifficultyDao;

    @Override
    public List<Cbdifficulty> getAllCbdifficulty() {
        return cbdifficultyDao.getAllCbdifficulty();
    }

    @Override
    public boolean saveCbdifficulty(Cbdifficulty cbdifficulty) {
        return cbdifficultyDao.saveCbdifficulty(cbdifficulty) > 0;
    }

    @Override
    public boolean updateCbdifficulty(Cbdifficulty cbdifficulty) {
        return cbdifficultyDao.updateCbdifficulty(cbdifficulty) > 0;
    }

    @Override
    public boolean deleteCbdifficultyByUid(int cbdid) {
        return cbdifficultyDao.deleteCbdifficultyByUid(cbdid) > 0;
    }
}

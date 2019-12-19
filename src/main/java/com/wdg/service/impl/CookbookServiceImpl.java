package com.wdg.service.impl;

import com.wdg.dao.ICookbookDao;
import com.wdg.pojo.*;
import com.wdg.service.ICookbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CookbookServiceImpl implements ICookbookService {

    @Resource
    private ICookbookDao cookbookDao;

    @Override
    public List<Cookbook> getAllCookbook(Map<String,Integer> map) {
        return cookbookDao.getAllCookbook(map);
    }

    @Override
    public Cookbook getAllCookbookOfAllByCbid(String cbid) {
        return cookbookDao.getAllCookbookOfAllByCbid(cbid);
    }

    @Override
    public boolean updateFoodstatus(String cbid) {
        return cookbookDao.updateFoodstatus(cbid) > 0;
    }

    @Override
    public List<Cbmain> getMain(String cbid) {
        return cookbookDao.getMain(cbid);
    }

    @Override
    public List<Cbtrim> getTrim(String cbid) {
        return cookbookDao.getTrim(cbid);
    }

    @Override
    public List<Food> getAllFood() {
        return cookbookDao.getAllFood();
    }

    @Override
    public boolean saveClassify(Map<String,String> map) {
        return cookbookDao.saveClassify(map) > 0;
    }

    @Override
    public int getNum() {
        return cookbookDao.getNum();
    }

}

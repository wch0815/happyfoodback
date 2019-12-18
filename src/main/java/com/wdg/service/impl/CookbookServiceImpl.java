package com.wdg.service.impl;

import com.wdg.dao.ICookbookDao;
import com.wdg.pojo.Cookbook;
import com.wdg.pojo.Foodstatus;
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
    public List<Cookbook> getAllCookbookOfAllByCbid(String cbid) {
        return cookbookDao.getAllCookbookOfAllByCbid(cbid);
    }

    @Override
    public boolean updateFoodstatus(Foodstatus foodstatus) {
        return cookbookDao.updateFoodstatus(foodstatus) > 0;
    }
}

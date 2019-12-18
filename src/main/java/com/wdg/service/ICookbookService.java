package com.wdg.service;

import com.wdg.pojo.Cookbook;
import com.wdg.pojo.Foodstatus;

import java.util.List;
import java.util.Map;

public interface ICookbookService {

    List<Cookbook> getAllCookbook(Map<String, Integer> map);

    List<Cookbook> getAllCookbookOfAllByCbid(String cbid);

    boolean updateFoodstatus(Foodstatus foodstatus);
}

package com.wdg.service;

import com.wdg.pojo.*;

import java.util.List;
import java.util.Map;

public interface ICookbookService {

    List<Cookbook> getAllCookbook(Map<String, Integer> map);

    Cookbook getAllCookbookOfAllByCbid(String cbid);

    boolean updateFoodstatus(String cbid);

    List<Cbmain> getMain(String cbid);

    List<Cbtrim> getTrim(String cbid);

    List<Food> getAllFood();

    boolean saveClassify(Map<String,String> map);

    int getNum();
}

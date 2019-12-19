package com.wdg.dao;

import com.wdg.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ICookbookDao {

    List<Cookbook> getAllCookbook(Map<String, Integer> map);

    Cookbook getAllCookbookOfAllByCbid(String cbid);

    int updateFoodstatus(String cbid);

    List<Cbmain> getMain(String cbid);

    List<Cbtrim> getTrim(String cbid);

    List<Food> getAllFood();

    int saveClassify(Map<String,String> map);

    int getNum();
}

package com.wdg.dao;

import com.wdg.pojo.Cookbook;
import com.wdg.pojo.Foodstatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ICookbookDao {

    List<Cookbook> getAllCookbook(Map<String, Integer> map);

    List<Cookbook> getAllCookbookOfAllByCbid(String cbid);

    int updateFoodstatus(Foodstatus foodstatus);

}

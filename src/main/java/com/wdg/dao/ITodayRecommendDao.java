package com.wdg.dao;

import com.wdg.pojo.TodayRecommend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ITodayRecommendDao {

    //获取所有
    List<TodayRecommend> getAllTodayRecommend();

    //增
    int saveTodayRecommend(TodayRecommend todayRecommend);

    //改
    int updateTodayRecommend(TodayRecommend todayRecommend);

    //删
    int deleteTodayRecommendByRid(int rid);
}

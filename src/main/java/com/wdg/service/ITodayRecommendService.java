package com.wdg.service;

import com.wdg.pojo.TodayRecommend;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITodayRecommendService {

    //获取所有
    List<TodayRecommend> getAllTodayRecommend();

    //增
    boolean saveTodayRecommend(TodayRecommend todayRecommend);

    //改
    boolean updateTodayRecommend(TodayRecommend todayRecommend);

    //删
    boolean deleteTodayRecommendByRid(int rid);
}

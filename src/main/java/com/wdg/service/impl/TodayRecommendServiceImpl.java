package com.wdg.service.impl;

import com.wdg.dao.ITodayRecommendDao;
import com.wdg.pojo.TodayRecommend;
import com.wdg.service.ITodayRecommendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TodayRecommendServiceImpl implements ITodayRecommendService {

    @Resource
    private ITodayRecommendDao todayRecommendDao;

    @Override
    public List<TodayRecommend> getAllTodayRecommend() {
        return todayRecommendDao.getAllTodayRecommend();
    }

    @Override
    public boolean saveTodayRecommend(TodayRecommend todayRecommend) {
        return todayRecommendDao.saveTodayRecommend(todayRecommend) > 0;
    }

    @Override
    public boolean updateTodayRecommend(TodayRecommend todayRecommend) {
        return todayRecommendDao.updateTodayRecommend(todayRecommend) > 0;
    }

    @Override
    public boolean deleteTodayRecommendByRid(int rid) {
        return todayRecommendDao.deleteTodayRecommendByRid(rid) > 0;
    }
}

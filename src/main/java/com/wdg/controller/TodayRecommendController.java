package com.wdg.controller;

import com.wdg.pojo.TodayRecommend;
import com.wdg.service.ITodayRecommendService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf_backstage")
public class TodayRecommendController {

    @Resource
    private ITodayRecommendService todayRecommendService;

    @GetMapping("/getAllTodayRecommend")
    public List<TodayRecommend> getAllTodayRecommend(){
        return todayRecommendService.getAllTodayRecommend();
    }

    @PostMapping("/saveTodayRecommend")
    public boolean saveTodayRecommend(TodayRecommend todayRecommend){
        return todayRecommendService.saveTodayRecommend(todayRecommend);
    }

    @PutMapping("/updateTodayRecommend")
    public boolean updateTodayRecommend(TodayRecommend todayRecommend){
        return todayRecommendService.updateTodayRecommend(todayRecommend);
    }

    @DeleteMapping("/deleteTodayRecommendByRid/{rid}")
    public boolean deleteTodayRecommendByRid(@PathVariable int rid){
        return todayRecommendService.deleteTodayRecommendByRid(rid);
    }

}

package com.wdg.controller;

import com.wdg.pojo.Cookbook;
import com.wdg.pojo.Foodstatus;
import com.wdg.service.ICookbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hf_backstage")
public class CookbookController {

    @Resource
    private ICookbookService cookbookService;

    @GetMapping("/getAllCookbook")
        public List<Cookbook> getAllCookbook(@RequestParam int page,@RequestParam int pageSize){

        Map<String,Integer> map = new HashMap<>();
        map.put("page",page-1);
        map.put("pagesize",pageSize);
        System.out.println(map);
        List<Cookbook> allCookbook = cookbookService.getAllCookbook(map);
        for (Cookbook cookbook : allCookbook) {
            System.out.println(cookbook);
        }
        return allCookbook;
    }

    @GetMapping("/getAllCookbookOfAllByCbid/{cbid}")
    public List<Cookbook> getAllCookbookOfAllByCbid(@PathVariable String cbid){
        List<Cookbook> allCookbookOfAllByCbid = cookbookService.getAllCookbookOfAllByCbid(cbid);
        for (Cookbook cookbook : allCookbookOfAllByCbid) {
            System.out.println(cookbook);
        }
        return allCookbookOfAllByCbid;
    }

    @PutMapping("/updateFoodstatus/{cbid}")
    public boolean updateFoodstatus(@PathVariable String cbid,@RequestParam int status){
        Foodstatus foodstatus = new Foodstatus();
        foodstatus.setCbid(cbid);
        foodstatus.setStatus(status);
        System.out.println(foodstatus);
        return cookbookService.updateFoodstatus(foodstatus);
    }
}

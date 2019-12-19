package com.wdg.controller;

import com.wdg.pojo.*;
import com.wdg.service.ICookbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        page=(page-1)*pageSize;
        map.put("page",page);
        map.put("pagesize",pageSize);
        System.out.println(map);
        return cookbookService.getAllCookbook(map);
    }

    @GetMapping("/getAllCookbookOfAllByCbid/{cbid}")
    public Cookbook getAllCookbookOfAllByCbid(@PathVariable String cbid){

        Cookbook allCookbookOfAllByCbid = cookbookService.getAllCookbookOfAllByCbid(cbid);
        List<Cbmain> cbmains = cookbookService.getMain(cbid);
        List<Cbtrim> cbtrims = cookbookService.getTrim(cbid);
        allCookbookOfAllByCbid.setCbmainList(cbmains);
        allCookbookOfAllByCbid.setCbtrimList(cbtrims);
        return allCookbookOfAllByCbid;
    }

    @PutMapping("/updateFoodstatus/{cbid}")
    public boolean updateFoodstatus(@PathVariable String cbid){

        return cookbookService.updateFoodstatus(cbid);
    }

    @GetMapping("/getAllFood")
    public List<Food> getAllFood(){
        return cookbookService.getAllFood();
    }

    @PostMapping("/saveClassify/{fid}")
    public boolean saveClassify(@PathVariable int fid,@RequestParam String cbid){
        Map<String,String> map = new HashMap<>();
        map.put("fid", String.valueOf(fid));
        map.put("cbid",cbid);
        System.out.println(map);
        return cookbookService.saveClassify(map);
    }

    @GetMapping("/getNum")
    public int getNum(){

        return cookbookService.getNum();
    }
}

package com.wdg.controller;

import com.wdg.pojo.Cbtool;
import com.wdg.service.ICbtoolService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf_backstage")
public class CbtoolController {

    @Resource
    private ICbtoolService cbtoolService;

    @GetMapping("/getAllCbtool")
    public List<Cbtool> getAllCbtool(){
        return cbtoolService.getAllCbtool();
    }

    @PostMapping("/saveCbtool")
    public boolean saveCbtool(Cbtool cbtool){
        return cbtoolService.saveCbtool(cbtool);
    }

    @PutMapping("/updataCbtool")
    public boolean updataCbtool(Cbtool cbtool){
        return cbtoolService.updateCbtool(cbtool);
    }

    @DeleteMapping("/deleterCbtoolByCbtid/{cbtid}")
    public boolean deleterCbtool(@PathVariable int cbtoid){
        return cbtoolService.deleterCbtoolByCbtoid(cbtoid);
    }
}

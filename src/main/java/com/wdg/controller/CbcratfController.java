package com.wdg.controller;

import com.wdg.pojo.Cbcratf;
import com.wdg.service.ICbcratfService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf-backstage")
public class CbcratfController {

    @Resource
    private ICbcratfService cbcratfService;

    @GetMapping("/getAllCbcratf")
    public List<Cbcratf> getAllCbcratf(){
        return cbcratfService.getAllCbcratf();
    }

    @PutMapping("/updateCbcratf")
    public boolean updateCbcratf(Cbcratf cbcratf){
        return cbcratfService.updateCbcratf(cbcratf);
    }

    @PostMapping("/saveCbcratf")
    public boolean saveCbcratf(Cbcratf cbcratf){
        return cbcratfService.saveCbcratf(cbcratf);
    }

    @DeleteMapping("deleteCbcratfByUid/{cbcid}")
    public boolean deleteCbcratf(@PathVariable int cbcid){
        return cbcratfService.deleteCbcratfByUid(cbcid);
    }

}

package com.wdg.controller;

import com.wdg.pojo.Cbtaste;
import com.wdg.service.ICbtasteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf_backstage")
public class CbtasteController {

    @Resource
    public ICbtasteService iCbtasteService;

    @GetMapping("/getAllCbtaste")
    public List<Cbtaste> getAllCbtaste(){
        return iCbtasteService.getAllCbtaste();
    }

    @PostMapping("/saveCbtaste")
    public boolean saveCbtaste(Cbtaste cbtaste){
        return iCbtasteService.saveCbtaste(cbtaste);
    }

    @PutMapping("/updateCbtaste")
    public boolean updateCbtaste(Cbtaste cbtaste){
        return iCbtasteService.updateCbtaste(cbtaste);
    }

    @DeleteMapping("/deleteCbtasteByCbtaid/{cbtaid}")
    public boolean deleteCbtasteByCbtaid(@PathVariable int cbtaid){
        return iCbtasteService.deleteCbtasteByCbtaid(cbtaid);
    }

}

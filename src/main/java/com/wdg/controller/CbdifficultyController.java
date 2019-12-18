package com.wdg.controller;

import com.wdg.pojo.Cbdifficulty;
import com.wdg.service.ICbdifficultyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf-backstage")
public class CbdifficultyController {

    @Resource
    private ICbdifficultyService cbdifficultyService;

    @GetMapping("/getAllCbdifficulty")
    public List<Cbdifficulty> getAllCbdifficulty(){
        return cbdifficultyService.getAllCbdifficulty();
    }

    @PostMapping("/saveCbdifficulty")
    public boolean saveCbdifficulty(Cbdifficulty cbdifficulty){
        return cbdifficultyService.saveCbdifficulty(cbdifficulty);
    }

    @PutMapping("/updateCbdifficulty")
    public boolean updateCbdifficulty(Cbdifficulty cbdifficulty){
        return cbdifficultyService.updateCbdifficulty(cbdifficulty);
    }

    @DeleteMapping("/deleteCbdifficultyByUid/{cbdid}")
    public boolean deleteCbdifficulty(@PathVariable int cbdid){
        return cbdifficultyService.deleteCbdifficultyByUid(cbdid);
    }
}

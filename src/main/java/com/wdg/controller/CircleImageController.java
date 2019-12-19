package com.wdg.controller;

import com.wdg.pojo.CircleImage;
import com.wdg.service.ICircleImageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf_backstage")
public class CircleImageController {

    @Resource
    private ICircleImageService circleImageService;

    @GetMapping("/getAllCircleImage")
    public List<CircleImage> getAllCircleImage(){
        return circleImageService.getAllCircleImage();
    }

    @PostMapping("/saveCircleImage")
    public boolean saveCircleImage(CircleImage circleImage){
        return circleImageService.saveCircleImage(circleImage);
    }

    @PutMapping("/updateCircleImage")
    public boolean updateCircleImage(CircleImage circleImage){
        return circleImageService.updateCircleImage(circleImage);
    }

    @DeleteMapping("/deleteCircleImageByCid/{cid}")
    public boolean deleteCircleImageByCid(@PathVariable int cid){
        return circleImageService.deleteCircleImageByCid(cid);
    }

}

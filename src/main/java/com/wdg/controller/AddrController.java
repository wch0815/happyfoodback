package com.wdg.controller;

import com.wdg.pojo.Addr;
import com.wdg.service.IAddrService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hf-backstage")
public class AddrController {

    @Resource
    private IAddrService addrService;

    @GetMapping("/getAllAddr")
    public List<Addr> getAllAddr(){
        return addrService.getAllAddr();
    }

}

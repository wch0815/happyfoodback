package com.wdg.service;

import com.wdg.pojo.Cbtaste;

import java.util.List;

public interface ICbtasteService {

    //获取所有
    List<Cbtaste> getAllCbtaste();

    //增
    boolean saveCbtaste(Cbtaste cbtaste);

    //改
    boolean updateCbtaste(Cbtaste cbtaste);

    //删
    boolean deleteCbtasteByCbtaid(int cbtaid);

}

package com.wdg.service;

import com.wdg.pojo.Cbtool;

import java.util.List;

public interface ICbtoolService {

    //获取所有
    List<Cbtool> getAllCbtool();

    //增
    boolean saveCbtool(Cbtool cbtool);

    //改
    boolean updateCbtool(Cbtool cbtool);

    //删
    boolean deleterCbtoolByCbtoid(int cbtoid);
}

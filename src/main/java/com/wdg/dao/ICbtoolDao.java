package com.wdg.dao;

import com.wdg.pojo.Cbtool;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICbtoolDao {

    //获取所有
    List<Cbtool> getAllCbtool();

    //增
    int saveCbtool(Cbtool cbtool);

    //改
    int updateCbtool(Cbtool cbtool);

    //删
    int deleteCbtoolByCbtoid(int cbtoid);
}

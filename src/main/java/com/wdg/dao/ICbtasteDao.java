package com.wdg.dao;

import com.wdg.pojo.Cbtaste;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICbtasteDao {

    //获取所有
    List<Cbtaste> getAllCbtaste();

    //增
    int saveCbtaste(Cbtaste cbtaste);

    //更新
    int updateCbtaste(Cbtaste cbtaste);

    //删除
    int dalateCbtasteById(int cbtaid);
}

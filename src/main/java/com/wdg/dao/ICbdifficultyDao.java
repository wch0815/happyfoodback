package com.wdg.dao;

import com.wdg.pojo.Cbdifficulty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICbdifficultyDao {

    List<Cbdifficulty> getAllCbdifficulty();

    int saveCbdifficulty(Cbdifficulty cbdifficulty);

    int updateCbdifficulty(Cbdifficulty cbdifficulty);

    int deleteCbdifficultyByUid(int cbdid);
}

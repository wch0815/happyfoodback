package com.wdg.dao;

import com.wdg.pojo.Cbcratf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICbcratfDao {

    List<Cbcratf> getAllCbcratf();

    int saveCbcratf(Cbcratf cbcratf);

    int updateCbcratf(Cbcratf cbcratf);

    int deleteCbcratfByUid(int cbcid);
}

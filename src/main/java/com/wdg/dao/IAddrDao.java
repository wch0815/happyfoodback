package com.wdg.dao;

import com.wdg.pojo.Addr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAddrDao {

    List<Addr> getAllAddr();
}

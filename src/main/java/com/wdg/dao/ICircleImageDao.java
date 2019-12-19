package com.wdg.dao;

import com.wdg.pojo.CircleImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICircleImageDao {

    //获取所有
    List<CircleImage> getAllCircleImage();

    //增
    int saveCircleImage(CircleImage circleImage);

    //改
    int updateCircleImage(CircleImage circleImage);

    //删
    int deleteCircleImageByCid(int cid);

}

package com.wdg.service;

import com.wdg.pojo.CircleImage;

import java.util.List;

public interface ICircleImageService {

    //获取所有
    List<CircleImage> getAllCircleImage();

    //增
    boolean saveCircleImage(CircleImage circleImage);

    //改
    boolean updateCircleImage(CircleImage circleImage);

    //删
    boolean deleteCircleImageByCid(int cid);

}

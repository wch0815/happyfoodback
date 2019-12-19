package com.wdg.service.impl;

import com.wdg.dao.ICircleImageDao;
import com.wdg.pojo.CircleImage;
import com.wdg.service.ICircleImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CircleImageServiceImpl implements ICircleImageService {

    @Resource
    private ICircleImageDao CircleImageDao;

    @Override
    public List<CircleImage> getAllCircleImage() {
        return CircleImageDao.getAllCircleImage();
    }

    @Override
    public boolean saveCircleImage(CircleImage circleImage) {
        return CircleImageDao.saveCircleImage(circleImage) > 0;
    }

    @Override
    public boolean updateCircleImage(CircleImage circleImage) {
        return CircleImageDao.updateCircleImage(circleImage) > 0;
    }

    @Override
    public boolean deleteCircleImageByCid(int cid) {
        return CircleImageDao.deleteCircleImageByCid(cid) > 0;
    }
}

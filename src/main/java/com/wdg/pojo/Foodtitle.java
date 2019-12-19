package com.wdg.pojo;

import lombok.Data;

import java.util.List;

/**
 * 食物的一级分类
 */
@Data
public class Foodtitle {

    private int ftid;
    private String nametitle;
    private List<Food> foods;

}

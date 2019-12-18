package com.wdg.pojo;

import lombok.Data;

/**
 * 食物的二级分类
 */
@Data
public class Food {

    private String fid;
    private String ftid; // 食物的一级分类
    private String name;
}

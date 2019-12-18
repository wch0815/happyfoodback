package com.wdg.pojo;

import lombok.Data;

/**
 * 用户创建的菜单，个人一系列食谱的合集，是有一个食谱属于中国菜谱，也可以没有归属
 */
@Data
public class Menu {

    private String mid;
    private String uid;
    private String discribe;
    private String name;
    private String image;

}

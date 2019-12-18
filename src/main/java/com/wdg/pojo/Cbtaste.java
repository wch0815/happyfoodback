package com.wdg.pojo;

/*
菜谱口味
 */

import lombok.Data;

@Data
public class Cbtaste {

    private int cbtaid;
    private String taste; //口味有：微辣，三鲜，超辣，麻辣，酸辣，酸咸等

}

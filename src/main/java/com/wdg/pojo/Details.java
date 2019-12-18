package com.wdg.pojo;

import lombok.Data;

/*
菜谱的步骤描述
 */
@Data
public class Details {

    private int cbdid;
    private String cbid;
    private String image;
    private String describes;
    private int step;

}

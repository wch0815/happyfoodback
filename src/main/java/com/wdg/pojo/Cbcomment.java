package com.wdg.pojo;

import lombok.Data;

/*
菜谱评论
 */
@Data
public class Cbcomment {

    private String cbcid;
    private int cbid;
    private User user;
    private String comment;
    private String time;
}

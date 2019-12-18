package com.wdg.pojo;

import lombok.Data;

/**
 * 话题
 */
@Data
public class Topic {

    private String tid;
    private String uid;
    private String image;
    private String title;//非必填项的一个话题的标题
    private String contents;

}

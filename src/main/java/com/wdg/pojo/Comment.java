package com.wdg.pojo;

import lombok.Data;

/**
 * 话题的评论
 */
@Data
public class Comment {

    private int tcid;
    private User user;
    private String tid;
    private String comment;
    private String times;
}

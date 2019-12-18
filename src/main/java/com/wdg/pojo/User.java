package com.wdg.pojo;

import lombok.Data;

/**
 * 用户
 */
@Data
public class User {

    private int uid;
    private String petname;
    private String password;
    private String headimage;
    private String subscribes;

}

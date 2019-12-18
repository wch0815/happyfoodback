package com.wdg.pojo;

import lombok.Data;

/*
用户地址
 */
@Data
public class Addr {

    private int aid;
    private int uid;
    private String province;
    private String city;
    private String county;
    private String detaillocal;
    private String tel;
    private String consname;

}

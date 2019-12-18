package com.wdg.pojo;

import lombok.Data;

/**
 * 食谱的后台管理的时候，即是否通过审核
 */
@Data
public class Foodstatus {
    private int status;// 1为通过审核，0为未审核
    private String cbid;


}

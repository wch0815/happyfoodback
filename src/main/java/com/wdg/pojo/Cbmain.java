package com.wdg.pojo;

import lombok.Data;

/**
 * 食谱的主材
 */

@Data
public class Cbmain {
    private int cbmid;
    private String cbid;
    private String main;//主食材名
    private String levels;//用量
}

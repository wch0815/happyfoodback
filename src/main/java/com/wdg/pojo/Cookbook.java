package com.wdg.pojo;

import lombok.Data;

import java.util.List;

/**
 * 菜谱主表
 */
@Data
public class Cookbook {

    private String cbid;
    private int mid;//属于哪个菜单
    private User user;
    private String cbname;
    private String finalcook;//最终的成品展示
    private String cbdescribe;//描述
    private String suggest;//建议
    private String cbtype;
    private String ordertime;

    private Foodstatus foodstatus;
    private Cbtime cbtime; //菜谱的制作时间,添加就加入id就可以
    private Cbdifficulty cbdifficulty; //菜谱的难度,添加就加入id就可以
    private Cbcratf cbcratf; //菜谱的工艺，添加就加入id就可以
    private Cbtaste cbtaste; // 菜谱的口味，添加就加入id就可以
    private List<Cbtool> cbtoolList; //菜谱的厨具，添加时将菜谱id和厨具的id添加到cb_tool表中，查询就是根据菜谱id查询所有的tool的id，然后找到所有的厨具
    private List<Cbtrim> cbtrimList; //菜谱的辅料
    private List<Cbmain> cbmainList; //菜谱的主料
    private  List<Details> detailsList;

}

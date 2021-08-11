package com.example.bill_detail.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParentDetail {
    /*
    * select id,nickname,gender,phone,create_time,icon,is_first
    *  from ums_member where parent_user_id in(select invite_code from ums_member where id=275);*/
    private int id;//用户ID
    private String nickname;//用户名字
    private int gender;//性别
    private String phone;//手机号
    private String create_time;//注册时间
    private String icon;//头像
    private int is_first;//是否下单

}

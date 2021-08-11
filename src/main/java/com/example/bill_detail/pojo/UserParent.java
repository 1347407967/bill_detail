package com.example.bill_detail.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserParent {
    private int id;//ID 
    private String nickname;//用户姓名
    private String create_time;//注册时间
    private int count;//邀请人数
    private String parent_user_nickname;//上级姓名
}

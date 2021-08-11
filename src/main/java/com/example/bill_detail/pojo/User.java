package com.example.bill_detail.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int member_id;//用户ID
    private String nickname;//用户名字
    private int member_type;//团位置
    private int bill_count;//团人数
    private String create_time;//创建时间
    private String bill_sn;//团号
    private double order_amount;//实付价格
    private int total_invite;//邀请人数
}

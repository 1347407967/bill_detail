package com.example.bill_detail.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class bill_detail {
    /*
    *  member_id,
    * create_time,
    * bill_sn,
    * order_sn,
    * item_amount,
    * order_amount,
    * dis_amount,
    * nickname,
    * icon,
    * total_invite */
    private int member_id;//用户ID
    private String create_time;//创建时间
    private String bill_sn;//团号
    private String order_sn;//订单号
    private int item_amount;//商品价格
    private int order_amount;//实付价格
    private int dis_amount;//返现
    private String nickname;//名字
    private String icon;//头像
    private int total_invite;//邀请次数

}

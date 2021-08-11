package com.example.bill_detail.service;

import com.example.bill_detail.pojo.User;
import com.example.bill_detail.pojo.query.Query;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    //主页查询列表
    List<User> findAll();

    //按照用户名模糊查询
    PageInfo<User> findByName(Query query);

    /*
     * 详情页
     * */
    PageInfo<User> findByBillSn(Query query);
}

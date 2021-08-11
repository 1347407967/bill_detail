package com.example.bill_detail.service;

import com.example.bill_detail.pojo.ParentDetail;
import com.example.bill_detail.pojo.UserParent;
import com.example.bill_detail.pojo.query.Query;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserParentService {
    //输出全部
    List<UserParent> findUserParent();

    //模糊查询名字和手机号
    PageInfo<UserParent> findUserParentByName(Query query);

    /*
     * 详情
     * */
    PageInfo<ParentDetail> findParentDetail(Query query);
}

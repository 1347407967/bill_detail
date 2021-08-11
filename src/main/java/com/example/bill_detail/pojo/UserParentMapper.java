package com.example.bill_detail.pojo;

import com.example.bill_detail.pojo.query.Query;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserParentMapper {
    //输出全部
    List<UserParent> findUserParent();

    //模糊查询名字和手机号
    List<UserParent> findUserParentByName(Query query);

    /*
    * 详情
    * */
    List<ParentDetail> findParentDetail(Query query);
}

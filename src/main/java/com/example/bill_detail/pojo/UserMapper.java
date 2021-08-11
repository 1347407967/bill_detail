package com.example.bill_detail.pojo;

import com.example.bill_detail.pojo.query.Query;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

@Mapper
public interface UserMapper {
    //主页查询列表
    List<User> findAll();

    //按照用户名模糊查询
    List<User> findByName(Query query);

    /*
    * 详情页
    * */
    List<User> findByBillSn(Query query);
}

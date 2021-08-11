package com.example.bill_detail;

import com.example.bill_detail.pojo.*;
import com.example.bill_detail.pojo.query.Query;
import com.example.bill_detail.service.UserParentServiceImpl;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Mytest {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserParentMapper userParentMapper;

    @Autowired
    UserParentServiceImpl userParentService;

    /*
     * 首页主列表
     * */
    @Test
    public void test1() {
        List<User> all = userMapper.findAll();
        System.out.println("输出");
    }

    @Test
    public void test2(){
        List<UserParent> userParent = userParentMapper.findUserParent();
        System.out.println(userParent);

    }

    @Test
    public void test3(){
        System.out.println("1111");
    }


    @Test
    public void test4(){
        Query query = new Query();
        query.setNickname("18567274896");
        System.out.println(query);
        List<UserParent> userParentByName = userParentMapper.findUserParentByName(query);
        System.out.println(userParentByName);
    }

    @Test
    public void test5(){
        Query query = new Query();
        query.setNickname("18567274896");
        System.out.println(query);
        PageInfo<UserParent> userParentByName = userParentService.findUserParentByName(query);
        System.out.println(userParentByName);
    }

    @Test
    public void test6(){
        Query query = new Query();
        query.setNickname("PT2240202108020174");
        System.out.println(query);
        List<User> byBillSn = userMapper.findByBillSn(query);
        System.out.println(byBillSn);

    }


    @Test
    public void test7(){
        List<UserParent> userParent = userParentMapper.findUserParent();
        System.out.println(userParent);
    }

    @Test
    public void test8(){
        List<UserParent> userParent = userParentService.findUserParent();
        System.out.println(userParent);
    }

    @Test
    public void test9(){
        Query query=new Query();
        query.setId(275);
        PageInfo<ParentDetail> parentDetail = userParentService.findParentDetail(query);
        System.out.println(parentDetail);
    }


}

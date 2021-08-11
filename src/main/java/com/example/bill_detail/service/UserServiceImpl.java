package com.example.bill_detail.service;

import com.example.bill_detail.pojo.User;
import com.example.bill_detail.pojo.UserMapper;
import com.example.bill_detail.pojo.query.Query;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    /*
    * 首页主列表
    * */
    @Override
    public List<User> findAll() {
        List<User> all = userMapper.findAll();
        return all;
    }

    @Override
    public PageInfo<User> findByName(Query query) {
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        PageInfo pageInfo = new PageInfo<>(userMapper.findByName(query));
        return pageInfo;
    }

    @Override
    public PageInfo<User> findByBillSn(Query query) {
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.findByBillSn(query));
        return pageInfo;
    }
}

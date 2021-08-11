package com.example.bill_detail.service;

import com.example.bill_detail.pojo.ParentDetail;
import com.example.bill_detail.pojo.UserParent;
import com.example.bill_detail.pojo.UserParentMapper;
import com.example.bill_detail.pojo.query.Query;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserParentServiceImpl implements UserParentService{
    @Autowired
    UserParentMapper userParentMapper;
    @Override
    public List<UserParent> findUserParent() {
        List<UserParent> userParent = userParentMapper.findUserParent();
        return userParent;
    }

    @Override
    public PageInfo<UserParent> findUserParentByName(Query query) {
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        PageInfo<UserParent> userParentPageInfo = new PageInfo<>(userParentMapper.findUserParentByName(query));
        return userParentPageInfo;
    }

    @Override
    public PageInfo<ParentDetail> findParentDetail(Query query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        PageInfo<ParentDetail> parentDetailPageInfo = new PageInfo<>(userParentMapper.findParentDetail(query));
        return parentDetailPageInfo;
    }
}

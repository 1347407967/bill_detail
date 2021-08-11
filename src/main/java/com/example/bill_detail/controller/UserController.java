package com.example.bill_detail.controller;

import com.example.bill_detail.pojo.ParentDetail;
import com.example.bill_detail.pojo.User;
import com.example.bill_detail.pojo.UserParent;
import com.example.bill_detail.pojo.query.Query;
import com.example.bill_detail.service.UserParentServiceImpl;
import com.example.bill_detail.service.UserServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    UserParentServiceImpl userParentService;
//    @GetMapping("/")
//    public Object print(){
//        List<User> all = userService.findAll();
//        return all;
//    }

    @GetMapping("/")
    public String print1(Query query, Model model){
        PageHelper.startPage(query);
        PageInfo<User> pageInfo = new PageInfo<>(userService.findAll());
        model.addAttribute("arg",pageInfo);
        return "index1";
    }

    @PostMapping("/")
    public String findByName(Query query,Model model){
        PageInfo<User> byName = userService.findByName(query);
        model.addAttribute("arg",byName);
        return "index1";
    }

    @GetMapping("/UserParent")
    public String UserParent(Query query,Model model){
        PageHelper.startPage(query);
        PageInfo<UserParent> userParentPageInfo = new PageInfo<>(userParentService.findUserParent());
        model.addAttribute("arg",userParentPageInfo);
        System.out.println("输出成功");
        return "parent1";
    }

    @PostMapping("/UserParent")
    public String UserParentByName(Query query,Model model){
        PageInfo<UserParent> userParentByName = userParentService.findUserParentByName(query);
        model.addAttribute("arg",userParentByName);
        return "parent1";
    }

    @GetMapping("/BillDetail")
    public String BiLLDetail(Query query,Model model){
        PageInfo<User> byBillSn = userService.findByBillSn(query);
        model.addAttribute("msg",byBillSn);
        return "billDetail";
    }

    @GetMapping("/ParentDetail")
    public String ParentDetail(Query query,Model model){
        PageInfo<ParentDetail> parentDetail = userParentService.findParentDetail(query);
        model.addAttribute("msg",parentDetail);
        return "parentDetail";
    }
}

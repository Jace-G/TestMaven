package com.chq.testmaven.controller;

import com.chq.testmaven.entity.Admin;
import com.chq.testmaven.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by chqian on 2016/12/2.
 */
@Controller
@RequestMapping("/adminManage")
public class AdminController {
    @Resource
    private AdminService adminService;
    @RequestMapping("/showAdmin")
    public String showAdmin(String id, HttpServletRequest request){
        Admin admin = adminService.selectByPrimaryKey(Integer.parseInt(id));
        request.setAttribute("admin",admin);
        System.out.println("哈哈哈哈哈"+admin.getUsername());
        return "success";
    }
}

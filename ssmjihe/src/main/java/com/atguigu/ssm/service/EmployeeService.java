package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {


    //查询所有的员工信息--->/employee--->get
    List<Employee> getAllEmployee();


    //获取员工的分页信息
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.EmployeeMapper;
import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Employee> getAllEmployee() {


        return employeeMapper.getAllEmployee();


    }

    //获取员工的分页信息
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能。
        PageHelper.startPage(pageNum,4);
        //查询所有的员工信息
        List<Employee> list = employeeMapper.getAllEmployee();

        //获取分页相关数据,第二个参数是导航分页。
        PageInfo<Employee> page = new PageInfo<Employee>(list,5);
        return page;
    }
}

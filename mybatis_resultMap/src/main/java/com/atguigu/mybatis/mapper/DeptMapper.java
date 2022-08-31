package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId );

    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分步查询，来查询部门及部门中的员工信息的第一步。
     * @param deptId
     * @return
     */

    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);

}

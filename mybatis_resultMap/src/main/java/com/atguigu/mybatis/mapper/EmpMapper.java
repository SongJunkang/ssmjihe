package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /**
     *
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    Emp getUserById();

    /**
     * 通过员工Id查询员工信息和对应的部门信息。
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分步查询，查询员工及所对应的信息 。
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分步查询，来查询部门及部门中的员工信息的第二步。
     * @param deptId
     * @return
     */

    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);

}

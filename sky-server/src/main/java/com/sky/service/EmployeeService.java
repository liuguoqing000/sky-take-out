package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);


    /**
     * @desc  新增员工
     * @param employeeDTO
     * @date 2024/3/20 11:07
     **/
    void save(EmployeeDTO employeeDTO);


    /**
     * 员工分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /*
     * @desc 启用/禁用员工账号
     * @param status
     * @param id
     * @date 2024/3/21 21:25
     **/
    void startOrStop(Integer status, Long id);


    /*
     * @desc 查询员工信息
     * @param id
     * @date 2024/3/22 9:50
     **/
    Employee getById(Long id);

    
    /*
     * @desc 编辑员工信息
     * @param employeeDTO
     * @date 2024/3/22 11:00
     **/
    void update(EmployeeDTO employeeDTO);
}

package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

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
}

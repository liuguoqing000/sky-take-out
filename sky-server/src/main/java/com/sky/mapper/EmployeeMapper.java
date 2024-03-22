package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);


    /**
     * @desc 新增员工
     * @param employee
     * @date 2024/3/20 11:23
     **/
    @Insert("insert into employee (name, username, password, phone, sex, id_number, create_time, update_time, create_user, update_user, status) " +
            "values " +
            "(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{createTime},#{updateTime},#{createUser},#{updateUser},#{status})"
    )
    void insert(Employee employee);


    /*
     * @desc 员工分页查询
     * @param employeePageQueryDTO
     * @date 2024/3/21 21:28
     **/
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);


    /*
     * @desc 启用/禁用员工账号
     * @param employee
     * @date 2024/3/21 21:49
     **/
    void update(Employee employee);


    /*
     * @desc 查询员工信息
     * @param id
     * @date 2024/3/22 9:50
     **/
    @Select("select * from employee where id = #{id}")
    Employee getById(Long id);
}

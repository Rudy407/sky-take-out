package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;
import com.sky.result.Result;

public interface EmployeeService {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     *
     * @param employeeDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     *
     * @param employeePageQueryDTO
     * @return
     */
    public PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工账号
     *
     * @param status
     * @param id
     * @return
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据id查询员工
     *
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     *
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}

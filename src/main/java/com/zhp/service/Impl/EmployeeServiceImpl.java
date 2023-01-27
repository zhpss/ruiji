package com.zhp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhp.entity.Employee;
import com.zhp.mapper.EmployeeMapper;
import com.zhp.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-21 10:51
 **/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}

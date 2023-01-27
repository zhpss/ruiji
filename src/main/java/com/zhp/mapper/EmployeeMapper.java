package com.zhp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhp.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}

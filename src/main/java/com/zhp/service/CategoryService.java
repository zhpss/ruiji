package com.zhp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhp.entity.Category;
import com.zhp.entity.Employee;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}

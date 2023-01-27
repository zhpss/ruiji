package com.zhp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhp.dto.SetmealDto;
import com.zhp.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    /*
    * 新增套餐，同时需要保存套餐和菜品的对应关系
    *
    * */
    public void saveWithDish(SetmealDto setmealDto);
    /*
    * 删除套餐，同时需要删除要删除菜品的关联数据
    *
    *
    * */
    public void removeWithDish(List<Long> ids);
}

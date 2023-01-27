package com.zhp.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhp.common.CustomException;
import com.zhp.entity.Category;
import com.zhp.entity.Dish;
import com.zhp.entity.Employee;
import com.zhp.entity.Setmeal;
import com.zhp.mapper.CategoryMapper;
import com.zhp.mapper.EmployeeMapper;
import com.zhp.service.CategoryService;
import com.zhp.service.DishService;
import com.zhp.service.EmployeeService;
import com.zhp.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-21 10:51
 **/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;
    /*
    * 根据id删除分类，删除之前需要进行判断
    *
    *
    * */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件,根据分类id进行查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count = dishService.count(dishLambdaQueryWrapper);


        //查询当前分类是否关联了菜品,如果已经关联，抛出一个业务异常
        if (count > 0){
            //已经关联了菜品，抛出一个业务异常
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }
        //查询当前分类是否关联了套餐，如果已经关联，抛出一个业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件,根据分类id进行查询
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count1 = setmealService.count();
        if (count1 > 0){
            //已经关联了套餐，抛出一个业务异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        //正常删除分类
        super.removeById(id);

    }
}

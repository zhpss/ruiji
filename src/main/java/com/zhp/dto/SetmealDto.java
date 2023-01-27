package com.zhp.dto;


import com.zhp.entity.Setmeal;
import com.zhp.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

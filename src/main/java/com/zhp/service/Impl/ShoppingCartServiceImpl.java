package com.zhp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhp.entity.ShoppingCart;
import com.zhp.mapper.ShoppingCartMapper;
import com.zhp.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-25 16:54
 **/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}

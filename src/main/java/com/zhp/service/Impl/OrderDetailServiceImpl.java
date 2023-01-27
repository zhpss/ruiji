package com.zhp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhp.entity.OrderDetail;
import com.zhp.mapper.OrderDetailMapper;
import com.zhp.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-25 18:33
 **/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}

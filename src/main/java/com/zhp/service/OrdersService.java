package com.zhp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.org.apache.xpath.internal.operations.Or;
import com.zhp.entity.Orders;

public interface OrdersService extends IService<Orders> {
    /*
    * 用户下单
    *
    * */
    public void submit(Orders orders);
}

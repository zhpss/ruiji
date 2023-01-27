package com.zhp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhp.entity.User;
import com.zhp.mapper.UserMapper;
import com.zhp.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-25 09:32
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

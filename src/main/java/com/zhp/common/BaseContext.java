package com.zhp.common;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-22 22:12
 **/
/*
*
* 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
*
*
* */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrendId(long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}

package com.zhp.common;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-24 11:18
 **/
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}

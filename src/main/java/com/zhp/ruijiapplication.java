package com.zhp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-21 09:40
 **/
@SpringBootApplication
@Slf4j
@ServletComponentScan//扫描过滤器
@EnableTransactionManagement
@EnableCaching
//直接可以使用log输出日志
public class ruijiapplication {
    public static void main(String[] args) {
        SpringApplication.run(ruijiapplication.class,args);
        log.info("项目启动成功");

    }
}

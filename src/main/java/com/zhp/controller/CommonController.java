package com.zhp.controller;

import com.zhp.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/**
 * @program: ruiji
 * @description:
 * @author: Mr.zhang
 * @create: 2023-01-24 15:03
 **/
/*
*
* 文件上传和下载
* */
@RestController
@RequestMapping("common")
@Slf4j
public class CommonController {
    @Value("${ruiji.path}")
    private String basePath;

    @PostMapping("/upload")
    public R<String> upload(MultipartFile file) throws IOException {
        //file是一个临时文件，需要转存到指定位置，否则本次请求完成后临时文件会删除
        log.info(file.toString());
        //原始文件名
        String originalFilename = file.getOriginalFilename();
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));

        //使用UUID重新生成文件名，防止文件名称重复造成文件覆盖
        String filename = UUID.randomUUID().toString() + substring;

        //创建一个目录对象
        File file1 = new File(basePath);
        //判断当前目录是否存在
        if (!file1.exists()){
            file1.mkdirs();
        }

        //将临时文件转存到指定位置
        file.transferTo(new File(basePath+filename));

        return R.success(filename);
    }
    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) throws IOException {
        //输入流，通过输入流来读取文件内容
        FileInputStream fileInputStream = new FileInputStream(new File(basePath+name));
        //输出流，通过输出流将文件写回浏览器
        ServletOutputStream outputStream = response.getOutputStream();

        response.setContentType("image/jpeg");
        int len = 0;
        byte[] bytes = new byte[1024];

        while ((len = fileInputStream.read(bytes)) !=-1){
            outputStream.write(bytes,0,len);
            outputStream.flush();
        }

        //关闭资源
        outputStream.close();
        fileInputStream.close();
    }

}

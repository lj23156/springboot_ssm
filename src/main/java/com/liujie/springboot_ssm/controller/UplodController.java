package com.liujie.springboot_ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UplodController {

    @RequestMapping("/upload")
    public String upload(){
        System.out.println("-----------upload-----------------");
        return "upload";
    }

    @ResponseBody
    @RequestMapping("receiveFile")
    public String receiveImage(MultipartFile image, HttpServletRequest request ) throws IllegalStateException, IOException {
        /*可以通过 HTTPServletRequest 的对象来得到当前项目名称，和 jsp 中的 pageContext.request.contextPath 效果一致
        但是要注意加入 server 的运行时环境，否则找不到 HttpServletRequest 类，或者在 pom.xml 中手动加入 servlet 的jar 包也行，
        而且在创建新的文件时，要以电脑的盘符作为开头，使用绝对路径，否则会找不到文件路径而报错
        */
        System.out.println("______receiveFile________"  + image.getOriginalFilename());
        image.transferTo(new File("C://myfiles/tempFile/" +  image.getOriginalFilename()));
        return "success";
    }
}

package com.example.ems.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.mail.MailUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmsController {

    @GetMapping("/test")
    public String test(){
        String result = MailUtil.send("burbaco@snapmail.cc",
                "测试",
                "<h1>邮件来自Hutool测试</h1>",
                true,
                null);
        return result;
    }
}

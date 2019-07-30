package com.epi.java.blog_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @email jingyechenfu@aliyun.com
 * @author:SoftwareKang
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String testHello() {
        return "hello";
    }
}

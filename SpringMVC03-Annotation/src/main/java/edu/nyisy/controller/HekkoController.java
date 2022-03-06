package edu.nyisy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/27 9:44
 * @email p2hemia@nyist.edu.cn
 **/
@Controller
public class HekkoController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");

        return "hello"; //会被视图解析器处理
    }
}

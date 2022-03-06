package edu.nyist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/3/5 10:28
 * @email p2hemia@nyist.edu.cn
 **/
@Controller
public class EncodingController {

    //过滤器解决乱码
    @GetMapping("/e/t1")
    public String test1(String name, Model model) {
        model.addAttribute("msg",name);
        System.out.println(name);
        return "test";
    }
}

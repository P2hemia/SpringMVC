package edu.nyist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/27 14:30
 * @email p2hemia@nyist.edu.cn
 **/
@Controller
public class RestFulController {

    //原来的   ：http://localhost:8080/add?a=1&b=2
    //RestFul :http://localhost:8080/add/a/b
    @RequestMapping("/add/{a}/{b}")
    public String test01(@PathVariable int a,@PathVariable int b, Model model) {
        int res=a+b;
        model.addAttribute("msg","结果为"+res);

        return "test";
    }
}

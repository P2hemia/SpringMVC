package edu.nyist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/27 10:45
 * @email p2hemia@nyist.edu.cn
 **/
@Controller //代表这个类会被Spring接管，被这个注解的类中所有的方法，如何返回值是string，并且有具体页面，就会被视图解析器解析
public class ControllerTest2 {

    @RequestMapping("/t2")
    public String test1(Model model) {
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }
}

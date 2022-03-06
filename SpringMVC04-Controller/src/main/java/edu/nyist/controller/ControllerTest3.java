package edu.nyist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/27 11:04
 * @email p2hemia@nyist.edu.cn
 **/
@Controller
@RequestMapping("/c3")
public class ControllerTest3 {
    @RequestMapping("t1")
    public String test03() {

        return "test";
    }
}

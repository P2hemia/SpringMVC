package edu.nyist.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/27 10:33
 * @email p2hemia@nyist.edu.cn
 **/
//只要实现了Controller接口的类，就说明这是一个控制器
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","ControllerTest");
        modelAndView.setViewName("test");
        return modelAndView;
    }
}

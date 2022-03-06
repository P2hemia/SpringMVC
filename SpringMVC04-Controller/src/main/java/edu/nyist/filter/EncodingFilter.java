package edu.nyist.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/3/5 10:37
 * @email p2hemia@nyist.edu.cn
 **/
public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}

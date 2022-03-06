package edu.nyist.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/27 20:24
 * @email p2hemia@nyist.edu.cn
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private int age;


}

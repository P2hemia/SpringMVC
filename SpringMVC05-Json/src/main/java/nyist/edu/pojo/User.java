package nyist.edu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/3/5 16:54
 * @email p2hemia@nyist.edu.cn
 **/
//需要导入lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private String sex;
}

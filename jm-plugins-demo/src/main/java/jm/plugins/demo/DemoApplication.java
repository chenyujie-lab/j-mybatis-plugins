package jm.plugins.demo;

import jm.dict.plugin.annotation.EnableDictMapping;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: DemoApplication</p>
 * <p>描述: [启动类]</p>
 * <p>创建时间: 2022/5/8 22:07</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/5/8 22:07] [Chen Yujie][init]
 */
@EnableDictMapping
@SpringBootApplication
@MapperScan(basePackages = "jm.plugins.demo.mapper")
public class DemoApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }
}

package jm.plugins.demo.config;

import jm.dict.plugin.entity.JDictString;
import jm.dict.plugin.functional.JDictDataInputSource;
import jm.plugins.demo.service.IDictDataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: JDictConfig</p>
 * <p>描述: [JDict配置类]</p>
 * <p>创建时间: 2022/5/8 23:43</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/5/8 23:43] [Chen Yujie][init]
 */
@Configuration
public class JDictConfig {

    @Bean
    public JDictDataInputSource<JDictString> dictDataInputSource(IDictDataService dictDataService) {
        return dictDataService::listDictDataByType;
    }
}

package dict;

import com.alibaba.fastjson2.JSONObject;
import jm.plugins.demo.DemoApplication;
import jm.plugins.demo.entity.User;
import jm.plugins.demo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: DictMappingTest</p>
 * <p>描述: [字典映射测试类]</p>
 * <p>创建时间: 2022/7/3 22:58</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/7/3 22:58] [Chen Yujie][init]
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DictMappingTest {

    @Autowired
    private IUserService service;

    /**
     * Simple Object
     */
    @Test
    public void testObject () {
        User user = service.selectOneById(10);

        System.out.println(JSONObject.toJSONString(user));
    }

    /**
     * List
     */
    @Test
    public void testList () {
        List<Integer> ids = new ArrayList<>();
        ids.add(10);
        ids.add(11);
        List<User> userList = service.listByIds(ids);

        System.out.println(JSONObject.toJSONString(userList));
    }

    /**
     * Collection
     */
    @Test
    public void testCollection() {
        List<Integer> ids = new ArrayList<>();
        ids.add(10);
        ids.add(11);
        List<User> users = service.listUserHobbyByIds(ids);

        System.out.println(JSONObject.toJSONString(users));
    }
    /**
     * Association
     */
    @Test
    public void testAssociation() {
        User user = service.getUserCompanyByUserId(10);

        System.out.println(JSONObject.toJSONString(user));
    }

    /**
     * Mybatis Plus
     */
    @Test
    public void testSelectOneForMP() {
        User user = service.getByIdForMP(10);

        System.out.println(JSONObject.toJSONString(user));
    }

}

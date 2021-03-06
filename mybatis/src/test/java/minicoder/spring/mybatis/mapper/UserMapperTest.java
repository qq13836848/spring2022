package minicoder.spring.mybatis.mapper;

import minicoder.spring.mybatis.entity.User;
import minicoder.spring.mybatis.enums.UserSexEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author pete cat
 * @date 2022年02月09日 16:40
 */
@SpringBootTest
//@MybatisTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("a", "a", UserSexEnum.MAN));
    }

    @Test
    public void testQuery() {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() {
        User user = userMapper.getOne(33l);
        System.out.println(user);
        user.setNickName("jacky");
        userMapper.update(user);
        System.out.println(user);

    }
}

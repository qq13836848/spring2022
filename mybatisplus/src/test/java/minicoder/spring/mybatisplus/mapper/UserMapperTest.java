package minicoder.spring.mybatisplus.mapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import minicoder.spring.mybatisplus.entity.User;
import minicoder.spring.mybatisplus.enums.UserSexEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author pete cat
 * @date 2022年02月09日 16:40
 */
@SpringBootTest
public class UserMapperTest {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("a", "a", UserSexEnum.MAN));
    }

    @Test
    public void testQuery() {
        List<User> user = userMapper.selectList(null);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
//        User user = userMapper.getOne(30l);
//        System.out.println(user);
//        user.setNickName("jackyxml");
//        userMapper.update(user);
//        System.out.println(user);

    }
}

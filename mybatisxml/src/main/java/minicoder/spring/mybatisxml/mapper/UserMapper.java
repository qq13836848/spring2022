package minicoder.spring.mybatisxml.mapper;

import minicoder.spring.mybatisxml.entity.User;
import minicoder.spring.mybatisxml.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author pete cat
 * @date 2022年02月09日 16:21
 */
public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}

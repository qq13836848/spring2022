package minicoder.spring.mybatis.mapper;

import minicoder.spring.mybatis.entity.User;
import minicoder.spring.mybatis.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author pete cat
 * @date 2022年02月09日 16:21
 */
public interface UserMapper {

    @Select("SELECT * FROM users")
    @Results({
        @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
        @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id=#{id}")
    @Results({
        @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
        @Result(property = "nickName", column = "nick_name")
    })
    User getOne(Long id);

    @Insert("INSERT INTO users(userName, passWord, user_sex) VALUES(#{userName}, #{passWord}, #{userSex})" )
    void insert(User user);

    @Update("UPDATE users SET userName=#{userName}, nick_name=#{nickName} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id=#{id}")
    void delete(Long id);
}

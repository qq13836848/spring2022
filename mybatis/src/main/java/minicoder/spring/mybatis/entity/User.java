package minicoder.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import minicoder.spring.mybatis.enums.UserSexEnum;

import java.io.Serializable;

/**
 * @author pete cat
 * @date 2022年02月09日 11:17
 */
@Data
@ToString
public class User implements Serializable {
    private static final long serilVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;

    public User(String userName, String passWord, UserSexEnum userSex) {
        super();
        this.passWord = passWord;
        this.userName = userName;
        this.userSex = userSex;

    }
}

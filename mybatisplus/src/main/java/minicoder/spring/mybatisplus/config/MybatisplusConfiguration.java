package minicoder.spring.mybatisplus.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pete cat
 * @date 2022年02月10日 15:48
 */
@Configuration
@MapperScan("minicoder.spring.mybatisplus.mapper")
public class MybatisplusConfiguration {
}

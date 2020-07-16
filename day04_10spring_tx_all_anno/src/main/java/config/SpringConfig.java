package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration//设置配置
@ComponentScan("com.itheima")//设置注解扫描包
@Import({JdbcConfig.class,TransactionManagerConfig.class})//导入其它配置
@PropertySource("classpath:jdbc/jdbcConfig.properties")//设置加载属性源
@EnableTransactionManagement//开启事务管理器
public class SpringConfig {
}

package cn.com.taiji.spring;

import org.springframework.context.annotation.*;

@Configuration
//@Import({UserDaoConfig.class,UserServiceConfig.class})
@ComponentScan("cn.com.taiji.spring")
public class AppConfig {


//    @Bean
//    public UserService userService(){
//        return  new UserService();
//    }
//    @Bean
//    public UserDao userDao(){
//        return new UserDao();
//    }
}

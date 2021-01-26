package cn.com.taiji.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@Configuration
//@Import({UserDaoConfig.class,UserServiceConfig.class})
@ComponentScan("cn.com.taiji")
public class AppConfig {

    @EventListener
    public  void refreshListener(ContextRefreshedEvent event){
        System.out.println("getTimestamp :"+event.getTimestamp());
    }
//    @Bean
//    public UserService userService(){
//        return  new UserService();
//    }
//    @Bean
//    public UserDao userDao(){
//        return new UserDao();
//    }
}

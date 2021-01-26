package cn.com.taiji.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfig {
    @Bean
    public UserServiceConfig userService(){
        return new UserServiceConfig();
    }
}

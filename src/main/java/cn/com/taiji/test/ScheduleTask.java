package cn.com.taiji.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Scheue init finish");
    }
}

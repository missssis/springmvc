package cn.com.taiji.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save(){
        System.out.println("service save");
    }
}

package org.jeevan.usermgmt.service;

import java.util.ArrayList;
import java.util.List;
import org.jeevan.usermgmt.dto.User;
import org.springframework.stereotype.Component;

@Component
public class UserMgmtService {
    
    public User getUserDetails(long userId) {
        User user = new User();
        user.setAge(22);
        user.setId(01);
        user.setName("Jeevan");
        return user;
    }
    
    public List<User> listUsers() {

        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(22);
        u1.setId(01);
        u1.setName("Jeevan");
        users.add(u1);
        
        User u2 = new User();
        u2.setAge(25);
        u2.setName("Paaru");
        u2.setSalary(56.66);
        users.add(u2);
        
        return users;
    }
}

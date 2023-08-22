package com.test.testws2.sevices;

import com.test.testws2.Dao.IUser;
import com.test.testws2.Data.User;
import com.test.testws2.Data.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersSevice {
    final private IUser user;
    @Autowired
    public UsersSevice(IUser user) {
        this.user = user;
    }

    public List<UserTest> getUserList(String location){
        return user.UserList(location);
    }
}

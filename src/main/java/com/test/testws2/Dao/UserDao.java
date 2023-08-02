package com.test.testws2.Dao;

import com.test.testws2.Data.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDao implements IUser{
    @Override
    public List<User> UserList() {
        User user=null;
        List<User> userList=null;

        try {
            userList=new ArrayList<>();
            user=new User("Mehmet 2","Demir","Deneme",1);
            userList.add(user);
            user=new User("Renas","Aktas","Renas",2);
            userList.add(user);
            user=new User("Murat","Demir","Murat",3);
            userList.add(user);

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        return userList;
    }
}

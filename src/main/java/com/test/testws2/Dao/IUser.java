package com.test.testws2.Dao;

import com.test.testws2.Data.User;
import com.test.testws2.Data.UserTest;

import java.util.List;

public interface IUser {
     List<UserTest> UserList(String location);
}

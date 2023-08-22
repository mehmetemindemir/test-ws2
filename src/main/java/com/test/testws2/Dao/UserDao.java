package com.test.testws2.Dao;

import com.test.testws2.Data.User;
import com.test.testws2.Data.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao implements IUser{
    private  final JdbcTemplate jdbcTemplate;
    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserTest> UserList(String location) {
        List<UserTest> userList=null;
        SimpleJdbcCall call;
        Map<String,Object> execute=null;
        Map<String,Object> param=null;
        try {
            call=new SimpleJdbcCall(jdbcTemplate)
                    .withSchemaName("ADSDCS")
                    .withCatalogName("dcs_checkin_pkg")
                    .withFunctionName("getUserList")
                    .returningResultSet("products_ref_cursor", new BeanPropertyRowMapper<>(UserTest.class));

            call.declareParameters(
                    new SqlParameter("vLocation", Types.VARCHAR)
            );
            param=new HashMap<>();
            param.put("vLocation",location);
            execute=call.execute(param);
            userList= (List<UserTest>) execute.get("products_ref_cursor");


        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        userList.forEach(System.out::println);
        return userList;
    }
}

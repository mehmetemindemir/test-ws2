package com.test.testws2.Controller;

import com.test.testws2.Data.ListCriteria;
import com.test.testws2.Data.ResponseData;
import com.test.testws2.Data.User;
import com.test.testws2.sevices.PassengerService;
import com.test.testws2.sevices.UsersSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    UsersSevice usersSevice;
    PassengerService passengerService;

    @Autowired
    public TestController(UsersSevice usersSevice, PassengerService passengerService) {
        this.usersSevice=usersSevice;
        this.passengerService=passengerService;

    }

    @GetMapping( path = "/list")
    List<User> getList(){
        return usersSevice.getUserList();
    }
    @GetMapping( path = "/list2")
    ResponseEntity<List<String>> getList2(){
        List<String> list=new ArrayList<>();
        list.add("Mehmet");
        list.add("Renas");
        return ResponseEntity.badRequest().build();
    }
    @GetMapping( path = "/list3")
    ResponseData getList3(){
       ResponseData res=new ResponseData();
       res.setData(null);
       res.setStatus(HttpStatus.NOT_FOUND.name());
       res.setMessage("kayit bulunamadi");
        return res;
    }

    @GetMapping( path = "/list3/{name}")
    ResponseData getList4(@PathVariable String name){
        ResponseData res=new ResponseData();
        res.setData(name);
        res.setStatus(HttpStatus.OK.name());
        res.setMessage("service calisti");
        return res;
    }
    @PostMapping( path = "/list4")
    ResponseData getList5(@RequestBody String name){
        ResponseData res=new ResponseData();
        res.setData(name);
        res.setStatus(HttpStatus.OK.name());
        res.setMessage("service calisti");
        return res;
    }

    @PostMapping( path = "/list5")
    ResponseData getList6(@RequestBody ListCriteria criteria){
        ResponseData res=new ResponseData();
        res.setData(criteria.getName()+String.valueOf( criteria.getId()));
        res.setStatus(HttpStatus.OK.name());
        res.setMessage("service calisti");
        System.out.println("res : "+res.getMessage());

        return res;
    }



}

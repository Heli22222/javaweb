package com.example3.demo3.controller;

import com.example3.demo3.entity.Entity;
import com.example3.demo3.service.EntranceOfContr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class Controller {

   @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EntranceOfContr entranceOfContr;

    @GetMapping("/getList")
    public String theMainPage(@RequestParam(value="sentence",defaultValue = "System is online") String sentence){
        return String.format("hello user!  " + sentence);
    }

    @GetMapping("/getUserList")
    public String getUserList(String id){

        if(id.equals("1")){
            return "hello";
        }
        return "good to go";
    }

    @GetMapping("/queryUser")
    public Entity enquiryUser(String userName){

        Entity entity = entranceOfContr.enquiryUserInf(userName);
        return entity;
    }

  /*  @GetMapping("/delete")
    public void delete(String userName){
        Entity entity = entranceOfContr.deleteUserInf(userName);
        System.out.println("delete finished");
    }*/

//The following is a test of restemplate

    @GetMapping("/clientAttach")

    public String monitorClient(){
        String result = restTemplate.getForObject("http://localhost:8080/queryUser?userName=1",String.class);
        System.out.println("hello");
        return result;
    }
}

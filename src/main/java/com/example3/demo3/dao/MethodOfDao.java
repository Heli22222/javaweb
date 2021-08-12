package com.example3.demo3.dao;

import com.example3.demo3.entity.Entity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//public class Entrance{

    public interface MethodOfDao {
    Entity enquiryUserInf(String userName);

   // String deleteUserInf(String userName);
}
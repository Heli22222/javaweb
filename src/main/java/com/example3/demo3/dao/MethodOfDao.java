package com.example3.demo3.dao;

import com.example3.demo3.entity.Entity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MethodOfDao {
    Entity enquiryUserInf(String userName);
}

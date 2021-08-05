package com.example3.demo3.service.impl;

import com.example3.demo3.entity.Entity;
import com.example3.demo3.dao.MethodOfDao;
import com.example3.demo3.service.EntranceOfContr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntranceOfContrImpl implements EntranceOfContr {
    @Autowired
    private MethodOfDao methodOf;

    public Entity enquiryUserInf(String userName){
        return methodOf.enquiryUserInf(userName);
    }
}

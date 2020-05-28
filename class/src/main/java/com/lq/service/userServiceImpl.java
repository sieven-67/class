package com.lq.service;

import com.lq.dao.stuRepository;
import com.lq.po.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private stuRepository stuRepository;

    @Override
    public Stu checkstu(String name, String password) {
        Stu stu = stuRepository.findBystunameAndPassword(name,password);
        return stu;
    }
}

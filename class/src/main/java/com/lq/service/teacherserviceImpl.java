package com.lq.service;

import com.lq.po.Teacher;
import com.lq.dao.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class teacherserviceImpl implements teacherservice{

    @Autowired
    private teacherRepository teacherRepository;

    @Override
    public Teacher checktea(String name, String password) {
        Teacher teacher = teacherRepository.findByteachernameAndPassword(name,password);
        return teacher;
    }
}

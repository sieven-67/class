package com.lq.service;

import com.lq.po.Admin;
import com.lq.dao.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin checkadmin(String name, String password) {
        Admin admin = adminRepository.findByadminnameAndPassword(name,password);
        return admin;
    }
}

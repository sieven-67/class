package com.lq.service;

import com.lq.po.Admin;

public interface AdminService {

    Admin checkadmin(String name, String password);
}

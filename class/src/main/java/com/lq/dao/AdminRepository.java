package com.lq.dao;

import com.lq.po.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {

    Admin findByadminnameAndPassword(String name, String password);
}

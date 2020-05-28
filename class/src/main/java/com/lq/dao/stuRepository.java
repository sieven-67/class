package com.lq.dao;

import com.lq.po.Stu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stuRepository extends JpaRepository<Stu,Long>{

    Stu findBystunameAndPassword(String name, String password);
}

package com.lq.dao;

import com.lq.po.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByteachernameAndPassword(String name, String password);
}

package com.lq.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="t_teacher")
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;
    private String teachername;
    private String password;



    public Teacher() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", teachername='" + teachername + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

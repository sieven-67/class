package com.lq.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="t_stu")
public class Stu {

    @Id
    @GeneratedValue
    private Long id;
    private String stuname;
    private String password;

    private String avater;//头像

    @ManyToMany
    private List<Course> courses=new ArrayList<>();

    @ManyToOne
    private Mclass mclass;

    @ManyToOne
    private Attendance attendance;
    public Stu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Mclass getMclass() {
        return mclass;
    }

    public void setMclass(Mclass mclass) {
        this.mclass = mclass;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }


    @Override
    public String toString() {
        return "stu{" +
                "id=" + id +
                ", stuname='" + stuname + '\'' +
                ", password='" + password + '\'' +
                ", avater='" + avater + '\'' +
                '}';
    }
}

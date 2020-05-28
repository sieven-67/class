package com.lq.po;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="t_attendance")
public class Attendance {

    @Id
    @GeneratedValue
    private Long id;
    private Long stu_id;
    private String course_id;
    private String state;
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    @OneToMany(mappedBy = "attendance")
    private List<Stu> stus=new ArrayList<>();

    @OneToMany(mappedBy = "attendance")
    private List<Course> courses=new ArrayList<>();
    public Attendance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStu_id() {
        return stu_id;
    }

    public void setStu_id(Long stu_id) {
        this.stu_id = stu_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public List<Stu> getStus() {
        return stus;
    }

    public void setStus(List<Stu> stus) {
        this.stus = stus;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", stu_id=" + stu_id +
                ", course_id='" + course_id + '\'' +
                ", state='" + state + '\'' +
                ", time=" + time +
                '}';
    }
}

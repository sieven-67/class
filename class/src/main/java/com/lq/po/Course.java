package com.lq.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="t_course")
public class Course {

    @Id
    @GeneratedValue
    private Long course_id;
    private String coursename;
    private Long teacher_id;



    @ManyToMany(mappedBy = "courses")
    private List<Stu> stus=new ArrayList<>();

    @ManyToOne
    private Attendance attendance;
    public Course() {
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public List<Stu> getStus() {
        return stus;
    }

    public void setStus(List<Stu> stus) {
        this.stus = stus;
    }



    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + course_id +
                ", coursename='" + coursename + '\'' +
                ", teacher_id=" + teacher_id +
                '}';
    }
}

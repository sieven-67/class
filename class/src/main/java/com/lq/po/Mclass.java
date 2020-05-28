package com.lq.po;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="t_mclass")
public class Mclass {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "mclass")
    private List<Stu> stus=new ArrayList<>();

    public Mclass() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stu> getStus() {
        return stus;
    }

    public void setStus(List<Stu> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Mclass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

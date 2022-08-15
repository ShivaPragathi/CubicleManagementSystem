package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "cubicles")
public class Cubicle {
    private Integer id;
    private Boolean filled;
    private Integer cubicle_no;
    private String employee;

    public Cubicle() {
    }

    public Cubicle(Integer id, Boolean filled, Integer cubicle_no, String employee) {
        this.id = id;
        this.filled = filled;
        this.cubicle_no = cubicle_no;
        this.employee = employee;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Integer getCubicle_no() {
        return cubicle_no;
    }

    public void setCubicle_no(Integer cubicle_no) {
        this.cubicle_no = cubicle_no;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

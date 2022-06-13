package com.boot.centrailedException.model;

import java.io.Serializable;

public class EmployeeDto implements Serializable {

    private String name;
    private String dissignation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDissignation() {
        return dissignation;
    }

    public void setDissignation(String dissignation) {
        this.dissignation = dissignation;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                ", dissignation='" + dissignation + '\'' +
                '}';
    }
}

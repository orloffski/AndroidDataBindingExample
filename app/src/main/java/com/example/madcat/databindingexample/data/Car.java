package com.example.madcat.databindingexample.data;

public class Car {
    public String mark;
    public String model;
    public int year;
    public String employee;

    public Car(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}

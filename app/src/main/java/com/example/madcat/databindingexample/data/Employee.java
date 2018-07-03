package com.example.madcat.databindingexample.data;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.madcat.databindingexample.BR;

import java.util.ArrayList;
import java.util.List;

public class Employee extends BaseObservable {
    private String firstName = "";
    private String secondName = "";
    private int age = 0  ;

    public List<String> hobbies;

    public Employee(String firstName, String secondName, int age) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);

        this.hobbies = new ArrayList<>();
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
        notifyPropertyChanged(BR.secondName);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("FirstName: ").append(this.firstName).append("\n");
        sb.append("SecondName: ").append(this.secondName).append("\n");
        sb.append("Age: ").append(this.age).append("\n");

        return sb.toString();
    }

    public void addHobby(String hobbyName){
        this.hobbies.add(hobbyName);
    }
}

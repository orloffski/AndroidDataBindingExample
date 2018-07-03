package com.example.madcat.databindingexample;

import android.databinding.BindingAdapter;
import android.widget.TextView;

import com.example.madcat.databindingexample.data.Employee;

public class BindingAdapters {
    @BindingAdapter({"app:fullname"})
    public static void loadFullName(TextView view, Employee employee) {
        view.setText(employee.getFirstName() + " " + employee.getSecondName());
    }
}

package com.example.madcat.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.madcat.databindingexample.data.Employee;
import com.example.madcat.databindingexample.databinding.ActivityIncludeBinding;

public class IncludeBinding extends AppCompatActivity {

    ActivityIncludeBinding binding;
    Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData();
        bindData();
    }

    public void loadData(){
        employee = new Employee("John", "Smith", 25);
    }

    public void bindData(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_include);
        binding.setEmployee(employee);
    }
}

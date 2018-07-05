package com.example.madcat.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

import com.example.madcat.databindingexample.data.Employee;
import com.example.madcat.databindingexample.databinding.ActivityIncludeBinding;
import com.example.madcat.databindingexample.databinding.EmployeeFullDataBinding;

public class IncludeBinding extends AppCompatActivity {

    ActivityIncludeBinding binding;
    Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData();
        bindData();
        inflateView();
    }

    public void loadData(){
        employee = new Employee("John", "Smith", 25);
    }

    public void bindData(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_include);
        binding.setEmployee(employee);

        binding.employeeFullDataStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                EmployeeFullDataBinding binding = DataBindingUtil.bind(inflated);
                binding.setEmployee(employee);
            }
        });
    }

    public void inflateView(){
        if (!binding.employeeFullDataStub.isInflated()) {
            binding.employeeFullDataStub.getViewStub().inflate();
        }
    }
}

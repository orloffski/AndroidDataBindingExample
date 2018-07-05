package com.example.madcat.databindingexample.recyclerViewClasses;

import android.support.v7.widget.RecyclerView;

import com.example.madcat.databindingexample.data.Employee;
import com.example.madcat.databindingexample.databinding.EmployeeFullDataBinding;

public class EmployeeHolder extends RecyclerView.ViewHolder {

    EmployeeFullDataBinding binding;

    public EmployeeHolder(EmployeeFullDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Employee employee) {
        binding.setEmployee(employee);
        binding.executePendingBindings();
    }
}

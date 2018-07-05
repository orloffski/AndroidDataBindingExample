package com.example.madcat.databindingexample.recyclerViewClasses;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.madcat.databindingexample.R;
import com.example.madcat.databindingexample.data.Employee;

import java.util.LinkedList;
import java.util.List;

import com.example.madcat.databindingexample.databinding.EmployeeFullDataBinding;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeHolder> {

    private List<Employee> items = new LinkedList<>();

    public EmployeeAdapter(List<Employee> items) {
        this.items.addAll(items);
    }

    @NonNull
    @Override
    public EmployeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        EmployeeFullDataBinding binding = DataBindingUtil.inflate(inflater, R.layout.employee_full_data, parent, false);
        return new EmployeeHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

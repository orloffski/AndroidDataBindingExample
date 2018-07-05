package com.example.madcat.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.madcat.databindingexample.data.Employee;
import com.example.madcat.databindingexample.databinding.ActivityRecyclerViewBinding;
import com.example.madcat.databindingexample.recyclerViewClasses.*;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewBinding extends AppCompatActivity {

    ActivityRecyclerViewBinding binding;
    List<Employee> employees = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData();
        bindData();
        initRecyclerView();
    }

    public void loadData(){
        employees.add(new Employee("John", "Smith", 25));
        employees.add(new Employee("Fox", "Malder", 33));
        employees.add(new Employee("Garold", "Robbins", 54));
        employees.add(new Employee("Aleksander", "Duma", 38));
        employees.add(new Employee("Ernest", "Heminguey", 62));
        employees.add(new Employee("Mika", "Hakkinen", 49));
    }

    public void bindData(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
    }

    public void initRecyclerView(){
        recyclerView = binding.list;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        EmployeeAdapter adapter = new EmployeeAdapter(employees);
        recyclerView.setAdapter(adapter);
    }
}

package com.example.madcat.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.madcat.databindingexample.data.Car;
import com.example.madcat.databindingexample.data.Employee;
import com.example.madcat.databindingexample.databinding.ActivitySimpleBinding;

public class SimpleBindingActivity extends AppCompatActivity {

    Employee employee;
    Car car;
    ActivitySimpleBinding binding;

    TextView carMark;
    TextView carModel;
    TextView carYear;
    LinearLayout rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData();
        bindData();
        getViews();

        updateViewsTextSize(carModel, 25f);
    }

    public void loadData(){
        employee = new Employee("John", "Smith", 44);

        car = new Car("Toyota", "RAV4", 2015);
//        car = new Car("Toyota", "RAV4", 0);
    }

    public void bindData(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple);
        binding.setCar(car);
        binding.setEmployee(employee);
    }

    public void getViews(){
        carMark = binding.carMark;
        carModel = binding.carModel;
        carYear = binding.carYear;

        rootView = (LinearLayout) binding.getRoot();
    }

    public void updateViewsTextSize(TextView view, float size){
        view.setTextSize(size);
    }
}

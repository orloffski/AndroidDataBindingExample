package com.example.madcat.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.madcat.databindingexample.data.Car;
import com.example.madcat.databindingexample.databinding.ActivitySimpleBinding;

public class SimpleBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Car car = new Car("Toyota", "RAV4", 2015);
//        Car car = new Car("Toyota", "RAV4", 0);

        ActivitySimpleBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_simple);
        binding.setCar(car);
    }
}

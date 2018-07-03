package com.example.madcat.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.madcat.databindingexample.data.Car;
import com.example.madcat.databindingexample.databinding.ActivityObservableBinding;

public class ObservableBindingActivity extends AppCompatActivity {

    ActivityObservableBinding binding;
    ButtonHandler handler;

    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData();
        bindData();
    }

    public void loadData(){
        car = new Car("Chevrolet", "Impala", 1967);
    }

    public void bindData(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        binding.setCar(car);

        handler = new ButtonHandler();
        binding.setHandler(handler);
    }
}

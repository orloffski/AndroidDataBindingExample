package com.example.madcat.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.madcat.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    ActivityMainBinding binding;
    ButtonHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindData();
    }

    public void bindData(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        handler = new ButtonHandler();
        binding.setHandler(handler);
    }
}

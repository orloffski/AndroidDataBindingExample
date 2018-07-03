package com.example.madcat.databindingexample;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.madcat.databindingexample.data.Car;
import com.example.madcat.databindingexample.data.Employee;

public class ButtonHandler {
    public void openSimpleActivity(View view){
        Context context = view.getRootView().getContext();

        Intent intent = new Intent(context, SimpleBindingActivity.class);
        context.startActivity(intent);
    }

    public void openSimpleActivityV2(Context context){
        Intent intent = new Intent(context, SimpleBindingActivity.class);
        context.startActivity(intent);
    }

    public void openObservableBindingActivity(Context context){
        Intent intent = new Intent(context, ObservableBindingActivity.class);
        context.startActivity(intent);
    }

    public void openObservableBindingActivityV2(Context context){
        Intent intent = new Intent(context, ObservableBindingActivitySecond.class);
        context.startActivity(intent);
    }

    public void updateCar(Car car){
        car.mark.set("Lada");
        car.model.set("Vesta");
        car.year.set(2017);
    }

    public void updateEmployee(Employee employee){
        employee.setFirstName("Michael");
        employee.setSecondName("Norris");
        employee.setAge(60);
    }

    public void printData(Employee employee, Context context){
        ObservableBindingActivitySecond activitySecond = (ObservableBindingActivitySecond)context;

        Log.d("test", "from layout");
        Log.d("test", employee.toString());
        Log.d("test", "\n\n");
        Log.d("test", "from data");
        Log.d("test", activitySecond.employee.toString());
    }
}

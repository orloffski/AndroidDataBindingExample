package com.example.madcat.databindingexample.data;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class Car {
    public ObservableField<String> mark = new ObservableField<>();
    public ObservableField<String> model = new ObservableField<>();
    public ObservableInt year = new ObservableInt();

    public Car(String mark, String model, int year) {
        this.mark.set(mark);
        this.model.set(model);
        this.year.set(year);
    }
}

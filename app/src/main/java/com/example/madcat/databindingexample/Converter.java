package com.example.madcat.databindingexample;

import android.databinding.InverseMethod;

public class Converter {
    @InverseMethod("convertIntToString")
    public static int convertStringToInt(String value){
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static String convertIntToString(int value) {
        return String.valueOf(value);
    }
}

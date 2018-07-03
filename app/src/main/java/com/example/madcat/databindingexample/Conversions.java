package com.example.madcat.databindingexample;

import android.databinding.BindingConversion;

import java.util.List;

public class Conversions {
    @BindingConversion
    public static String convertHobbiesToString(List<String> hobbies) {
        StringBuilder sb = new StringBuilder();
        for (String hobby: hobbies) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(hobby);
        }
        return sb.toString();
    }
}

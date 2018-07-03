package com.example.madcat.databindingexample;

import android.content.Context;
import android.content.Intent;
import android.view.View;

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
}

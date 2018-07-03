package com.example.madcat.databindingexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSimpleBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpleBinding = findViewById(R.id.btnSimpleBinding);
        btnSimpleBinding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimpleBinding:
                Intent intent = new Intent(this, SimpleBindingActivity.class);
                startActivity(intent);
                break;
        }
    }
}

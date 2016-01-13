package com.example.activity.chapter06_homwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);


    }

    @Override
    public void onClick(View view) {
        updateTime();
    }

    private void updateTime(){
        btn.setText(new Date().toString());
    }
}

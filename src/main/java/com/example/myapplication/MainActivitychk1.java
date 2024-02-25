package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivitychk1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitychk1);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button submit1 = (Button) findViewById(R.id.submit1);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    public void openActivity4()
    {
        Intent intent=new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}
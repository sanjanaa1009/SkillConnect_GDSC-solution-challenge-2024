package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivitychk2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitychk2);

        Button submit2 = (Button) findViewById(R.id.submit2);

        submit2.setOnClickListener(new View.OnClickListener() {
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
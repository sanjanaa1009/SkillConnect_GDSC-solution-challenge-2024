package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signin1 = (Button) findViewById(R.id.signin1);
        Button newacc = (Button) findViewById(R.id.newacc);

        signin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity();
            }
        });
        newacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity()
    {
        Intent intent=new Intent(this, MainActivity0.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}




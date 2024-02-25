package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);
        Button next2 = (Button) findViewById(R.id.next2);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitychk2();
            }
        });
    }
    public void openActivitychk2()
    {
        Intent intent=new Intent(this, MainActivitychk2.class);
        startActivity(intent);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button applicant = (Button) findViewById(R.id.Applicant);
        Button Employer = (Button) findViewById(R.id.Employer);
        applicant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityapp();
            }
        });
        Employer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEmp();
            }
        });
    }
    public void openActivityapp()
    {
        Intent intent=new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivityEmp()
    {
        Intent intent=new Intent(this, MainActivity33.class);
        startActivity(intent);
    }
}

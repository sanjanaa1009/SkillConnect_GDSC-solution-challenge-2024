package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button next1 = (Button) findViewById(R.id.next2);

next1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        openActivity4();
    }
});
    }
    public void openActivity4()
    {
        Intent intent=new Intent(this, MainActivitychk1.class);
        startActivity(intent);
    }
}
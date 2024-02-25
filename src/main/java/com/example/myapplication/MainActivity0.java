package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity0 extends AppCompatActivity {
    public static final String TAG = "TAG";

    EditText mUsername, mPassword;
    Button mloginbtn;
    ProgressBar progressBar;
    private View view;
    // FirebaseFirestore fstore;
    //String userid;
    // FirebaseAuth fAuth;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        mUsername = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
        mloginbtn = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);

        //fAuth = FirebaseAuth.getInstance();
        //fstore = FirebaseFirestore.getInstance();

        mloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //protected <FirebaseUser, FirebaseUser> void onClick(View view)

            public void onClick(View view) {
                final String username = mUsername.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                //public void onClick(View view) {
                //  startActivity(new Intent(getApplicationContext(), Login.class));
                //}
                //});

                if (TextUtils.isEmpty(username)) {
                    mUsername.setError("Userid id required!");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    mPassword.setError("Password required!");
                    return;
                }
                if (password.length() < 6) {
                    mPassword.setError("Password must be more than 6 characters ");
                    return;
                }
                button=(Button) findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openActivity4();
                    }
                });
            }
        });
    }
    public void openActivity4()
    {
        Intent intent=new Intent(this, MainActivity4.class);
        startActivity(intent);

    }
}

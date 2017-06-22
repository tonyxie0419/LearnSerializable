package com.jikexueyuan.learnserializable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
        User newUser = (User) getIntent().getSerializableExtra("user");
        System.out.println("Secend: " + newUser);
    }
}

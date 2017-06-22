package com.jikexueyuan.learnserializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Serializable接口开销大，不推荐，推荐使用Parcelable(Android自带)接口序列化和反序列化数据
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //序列化过程
        User user = new User(0, "Jim", false);
        System.out.println("Main: " + user);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}

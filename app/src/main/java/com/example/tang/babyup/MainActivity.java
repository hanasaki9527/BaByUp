package com.example.tang.babyup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //当act创建的时候，就调用onCreate
        super.onCreate(savedInstanceState);

        //初始化页面
        setContentView(R.layout.activity_main);

    }


}

package com.example.tang.babyup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignClass extends Activity {

    private EditText et_username;
    private EditText et_password1;
    private EditText et_password2;
    private Button  SignButton;
    private Button JumpLogin;

    //初始化注册页面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_main);

        //定义按钮
        et_username = (EditText)findViewById(R.id.username_sign);
        et_password1 = (EditText)findViewById(R.id.password_sign1);
        et_password2 = (EditText)findViewById(R.id.password_sign2);
        SignButton = (Button)findViewById(R.id.SigninButton);
        JumpLogin = (Button)findViewById(R.id.JumpLogin);

        //添加事件
        SignButton.setOnClickListener(new SignClickLister());
        JumpLogin.setOnClickListener(new JumpLoginLister());

    }

    //注册button的响应事件
    private class SignClickLister implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //1获取内容,把内容转换成string类型
            String str_username = et_username.getText().toString().trim();
            String str_password1 = et_password1.getText().toString().trim();
            String str_password2 = et_password2.getText().toString().trim();

            //2.进行判断，输入不能为空，密码重复需要一致
            if (TextUtils.isEmpty(str_username)) {
                //Toast参数：当前activity，提示文字，展示时间
                Toast.makeText(SignClass.this, "账号不能为空", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(str_password1)) {
                //Toast参数：当前activity，提示文字，展示时间
                Toast.makeText(SignClass.this, "密码不能为空", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(str_password2)) {
                Toast.makeText(SignClass.this, "密码不能为空", Toast.LENGTH_SHORT).show();

            }
            //对比两次输入的密码是否一致
            else if (str_password1 != str_password2) {
                Toast.makeText(SignClass.this, "两次输入的密码不一致", Toast.LENGTH_SHORT).show();
            }
            //注册
            else {

            }


        }
    }


    //跳转到注册页面
    private class JumpLoginLister implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = new Intent(SignClass.this,LoginClass.class);

            startActivity(intent);
        }
    }


}



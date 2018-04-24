package com.example.tang.babyup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class Utils {
    //保存用户名和密码的方法，保存在"data/data/com.example.tang.babyup/info.txt"这个目录
    public static boolean SaveInfo(String str_username,String str_password){
        String info = str_username +"##"+ str_password;
        File file = new File("data/data/com.example.tang.babyup/info.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(info.getBytes());
            fos.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
    //读取已经保存的账号的方法
    //数组第一个元素是用户名，第二个元素是密码
    public  static String[] ReadInfo(){
        File file = new File("data/data/com.example.tang.babyup/info.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String temp = reader.readLine();
            String[] result = temp.split("##");
            return result;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

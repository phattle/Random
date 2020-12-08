package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //build in function : các phương thức sẽ đc gọi trực tiếp
       // mà ko cần khởi tạo lớp đối tượng

        //xem tham so truyen vao : ctrl+P
        //chuyen doi kieu du lieu// 1: su dung phuong thuc chuyen doi kieu du lieu
//        int a = 10;
//        String value = String.valueOf(a);
//        Log.d("BBB",value);
//        1:hàm làm tròn (Math.round)
//        float a = 1.49f;
//        double b = 1.5;
//        int result = Math.round(a);
//        Log.d("BBB",String.valueOf(result));
//        2: hàm làm tròn lên (Math.ceil)
//        double b = 1.01;
//        double result2 = Math.ceil(b);
//        Log.d("BBB",String.valueOf(result2));
//        3: Hàm làm tròn xuống (Math.floor)
//        double c = 0.99999;
//        double result3 = Math.floor(c);
//        Log.d("BBB",String.valueOf(result3));
//        4: Hàm random
//        random trong khoang tu 0-5

//        double result4=Math.round(Math.random()*5);
//        Log.d("BBB",String.valueOf(result4));

//      5->10
//        Random random = new Random();
//        int result5= random.nextInt(10-5 +1)+5;
//        Log.d("BBB",String.valueOf(result5));
    }
}
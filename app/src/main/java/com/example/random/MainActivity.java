package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //1 khai báo biên
    TextView mTvBieuthuc,mTvKetqua;
    ImageButton mImgButtonDung,mImgButtonSai;
    int mSothu1,mSothu2,mKetqua,mPheptinh;
    boolean mRandomketqua = false;
    Random mRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 ánh sạ
        mTvBieuthuc = findViewById(R.id.textViewBieuthuc);
        mTvKetqua = findViewById(R.id.textViewKetqua);
        mImgButtonDung = findViewById(R.id.imageButtonDung);
        mImgButtonSai = findViewById(R.id.imageButtonSai);

        // Task
        //1 : Random biet thuc
        //2 : Radom ket qua
        //3 : Kiem tra ket qua

        // random gia tri
        mSothu1 = mSothu2= mKetqua = mPheptinh = 0;
        mRandom = new Random();

        mSothu1 = mRandom.nextInt(10) + 1;
        mSothu2 = mRandom.nextInt(10) + 1;
//        Log.d("BBB","So thu 1 :"+ mSothu1);
//        Log.d("BBB","So thu 2 :"+ mSothu2);
        mPheptinh = mRandom.nextInt(4)+1;
        mRandomketqua = mRandom.nextBoolean();
        // 1: cong , 2: tru , 3: nhan, 4: chia


        switch (mPheptinh){
            case 1 : mKetqua = mSothu1 + mSothu2;
                mTvBieuthuc.setText(mSothu1 + " + " + mSothu2);
                break;
            case 2 : mKetqua = mSothu1 - mSothu2;
                mTvBieuthuc.setText(mSothu1 + " - " + mSothu2);
                break;
            case 3 : mKetqua = mSothu1 * mSothu2;
                mTvBieuthuc.setText(mSothu1 + " * " + mSothu2);
                break;
            case 4 : mKetqua = mSothu1 / mSothu2;
                mTvBieuthuc.setText(mSothu1 + " / " + mSothu2);
                break;
        }
        //        double result4=Math.round(Math.random()*5);
        if (mRandomketqua == false){
         mKetqua += mRandom.nextInt(5)+1;
        }
//        mKetqua += !mRandomketqua ? mRandom.nextInt(5)+1:0;
        mTvKetqua.setText(" = " + mKetqua);
        //su kien click cua imagebuton
        mImgButtonDung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if  (mRandomketqua== true){

                    Toast.makeText(MainActivity.this, "chinh xac", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Sai roi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mImgButtonSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if  (mRandomketqua== false){

                    Toast.makeText(MainActivity.this, "chinh xac", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Sai roi", Toast.LENGTH_SHORT).show();
                }
            }
        });
//        call back funtion
//      khi click vao imageviewButton

//        kiem tra view có ton tai hay ko
//        kieu tra vung nho cua view da dc khoi tao chua
//        thuc hien su kien click

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
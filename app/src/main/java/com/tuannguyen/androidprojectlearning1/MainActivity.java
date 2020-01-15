package com.tuannguyen.androidprojectlearning1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hoten = "Nguyễn Anh Tuấn";
        int nam = 2020;
        Log.d("TUANNGUYEN", hoten + " " + nam);
    }
}

package com.stv.question10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* ボタンを押下するたびに、背景画像をランダムに切り替える。
* 背景画像のパターンは、5パターンとする。*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

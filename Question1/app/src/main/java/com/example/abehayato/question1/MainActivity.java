package com.example.abehayato.question1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.logging.Logger;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 変数の定義
        boolean b = false;
        String s = "文字列";
        int n = 0;
        double d = 0.0;

        // ログの出力
        Log.d("変数宣言","Boolean = " + b);
        Log.d("変数宣言","String = " + s);
        Log.d("変数宣言","Int = " + n);
        Log.d("変数宣言","Double = " + d);
    }
}

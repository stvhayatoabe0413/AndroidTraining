package com.stv.question7;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.logging.Logger;

/*
 * 簡単な a+b を作成する。
 *
 * 。Result　インタフェースを定義する。
 * 【result(int resultValue) メソッド】
 * 。Mathクラスを定義する。
 * a+bの計算を実施する。結果をResultにパスする。
 * 【calculate() メソッド】
 *
 * mainでResultインタフェースをinplementsし、
 * Mathクラスのcalculate()メソッドを呼ぶと計算結果をLogに表示する。
 * */

public class MainActivity extends Activity implements Result{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int a = 11;
        int b = 57;

        Math math = new Math(a,b,this);
        math.calculate();
    }

    @Override
    public void result(int resultValue){
        Log.d("Result result",String.valueOf(resultValue));
    }
}

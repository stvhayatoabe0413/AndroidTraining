package com.example.abehayato.question1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        Logger logger = Logger.getLogger("MainActivity"); // 引数の文字列は通常クラス名にするものらしい。
        logger.info("Boolean = " + b);
        logger.info("String = " + s);
        logger.info("Int = " + n);
        logger.info("Double = " + d);
    }
}

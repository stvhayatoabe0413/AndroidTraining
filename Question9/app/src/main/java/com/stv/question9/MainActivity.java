package com.stv.question9;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/*
* 任意の画像を表示する。
* なお、画像をdrawableフォルダーに格納すること。
* ただし、下記の要件を満たすこと：
* ・アスペクト比を保った状態(Aspect	Fit)
* */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
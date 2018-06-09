package com.stv.question8;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/* 課題内容
*   「初めのAndroidアプリをスタートしました。」という本文をresourcesに入れる。
*    MainActivityでtextviewの内容は入れたStringを表示すること。
* */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText(R.string.textViewInMainActivity);
    }
}

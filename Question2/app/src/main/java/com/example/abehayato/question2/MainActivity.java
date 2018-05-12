package com.example.abehayato.question2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;

// ArrayList型、HashMap型、HashSet型の変数を定義し、コンソールにログを出力する。(Log)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 変数の定義
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();

        // ログを出力
        Logger logger = Logger.getLogger("Main");
        logger.info("ArrayList = " + arrayList);
        logger.info("HashMap = " + hashMap);
        logger.info("HashSet = " + hashSet);
    }
}

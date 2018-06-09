package com.example.abehayato.question2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;

// ArrayList型、HashMap型、HashSet型の変数を定義し、
// いくつかの中身を入れ、中身をそれぞれコンソールにログで出力する。(Log)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 変数の定義
        ArrayList<String> arrayList = new ArrayList();
        HashMap<Integer,String> hashMap = new HashMap();
        HashSet<String> hashSet = new HashSet();

        // 変数への代入
        String[] strings = new String[]{"1","2","3"};
        Arrays.stream(strings).forEach(s -> arrayList.add(s));
        int[] keys = new int[]{0};   // keyとして上書きしながら使う配列。
        Arrays.stream(strings).forEach(s -> hashMap.put(keys[0]++,s));
        Arrays.stream(strings).forEach(s -> hashSet.add(s));

        // ログを出力
        arrayList.forEach(s -> Log.d("ArrayList ",s));
        hashMap.forEach((key,value) -> Log.d("HashMap ",value));
        hashSet.forEach(s -> Log.d("HashSet ",s));
    }
}

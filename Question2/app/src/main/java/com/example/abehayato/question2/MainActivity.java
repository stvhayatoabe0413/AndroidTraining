package com.example.abehayato.question2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
        String[] strings = new String[]{"ArrayList1","ArrayList2","ArrayList3"};
        for(String str:strings){arrayList.add(str);}

        // HashMapではKeyが必要なのでfor文でiをKeyとして使う。
        strings = new String[]{"HashMap1","HashMap2","HashMap3"};
        for(int i=0;i<strings.length;i++){hashMap.put(i,strings[i]);}

        strings = new String[]{"HashSet1","HashSet2","HashSet3"};
        for(String str:strings){hashSet.add(str);}

        // ログを出力
        for(String str:arrayList){Log.d("ArrayList",str);}
        for(int i=0;i<hashMap.size();i++){Log.d("HashMap",hashMap.get(i));}
        for(String str:hashSet){Log.d("HashSet",str);}
    }
}

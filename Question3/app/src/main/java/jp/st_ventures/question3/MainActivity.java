package jp.st_ventures.question3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

/**
 *  if文、if〜else文、if〜else if文、三項演算子、while型、do-while型、for文、高速列挙構文、switchを利用したプログラムを作成し、結果をコンソールに出力する。
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // if文
        if(1+1==2) {
//            System.out.println("if文の結果");
            Log.d("if文の結果","正しい");
        }else{
            Log.d("if文の結果","間違い");
        }

        // if ~ else文
        if(1+1==3) {
            Log.d("if ~ else文の結果","正しい");
        }else {
//            System.out.println("if ~ else文の結果");
            Log.d("if ~ else文の結果","間違い");
        }

        // if ~ else if文
        if(1+1==3) {
            Log.d("if ~ else if文の結果","正しい1");
        }else if(1+1==2) {
//            System.out.println("if ~ else if文の結果");
            Log.d("if ~ else if文の結果","正しい2");
        }else{
            Log.d("if ~ else if文の結果","間違い");
        }

        // 三項演算子
        int target_1 = 1;
        int target_2 = 5;
        String answer = target_1 > target_2 ? "target_1 は target_2 よりも大きい" : "target_1 は target_2 よりも小さい";
//        System.out.println("三項演算子 ( 1 > 2 ? true : false ) = " + (1 > 2 ? true : false));
        Log.d("三項演算子",answer);

        // while文
        int count = 0;
        while(count<4) {
            System.out.println("while文 countが4未満ならば繰り返し count = " + count++);
        }

        // do-while型
        count = 0;
        do {
            System.out.println("do-while文 最低1回、countが0未満ならば繰り返し count = " + count++);
        } while (count<0);

        // for文
        for(int i=0; i<3; i++) {
            System.out.println("for文 i = " + i);
        }

        // 拡張for文(高速列挙構文の代用)
        String[] strings = {"aaa","bbb","ccc"};
        count = 0;
        for(String s : strings) {
            System.out.printf("拡張for文。中身%d番目 = %s \r\n",count++,s); // Windowsでは\r\nで改行できたが、Macでは上手く行かなかった。
        }

        // forEachメソッド
        int[] counts = new int[]{0};        // ラムダ式の中からは通常外の変数は変更出来ないが、配列ならばOK。
        Arrays.stream(strings).forEach(s -> System.out.printf("forEachメソッド。中身%d番目 = %s \r\n",counts[0]++,s));

        // swich文
        String str = "STV";
        switch (str) {
            case "STV":
                System.out.println("switch文。breakしていればここで終わるが、");
            default:
                System.out.println("していなければここも出る。");
                break;
        }
    }
}

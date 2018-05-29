package jp.st_ventures.question4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
 * Accountクラスコンストラクタを作成し、インターン(internship)の参加者の一覧をコンソールにログを出力する。
 * Accountクラスには、下記のプロパティとメソッドを定義する。
 *
 * 【プロパティ】
 * 氏名：文字列型
 * 年齢：整数型
 * 性別：文字列型
 * 得意な言語：文字列型
 *
 * 【メソッド】
 * 男性の場合、「○○君は、○○が得意な○○歳です。」と表示する。
 * 女性の場合、「○○さんは、○○が得意な○○歳です。」と表示する。
 *
 * なお、Encapsulation条件を満たす。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Account[] internshipParticipants = new Account[]{new Account("田中太郎",18,"男性","英語"),
                                                        new Account("鈴木恵子",18,"女性","英語"),
                                                        new Account("森田明美",20,"女性","中国語"),
                                                        new Account("木村拓郎",19,"男性","フランス語")};

        internshipParticipants.

    }

}

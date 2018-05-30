package com.stv.question5;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;


/*
* Teacherクラスを定義する：
* 名前：String
* 年齢：int
* 性別：boolean
* ベース給料：double
*
*
* 5YearTeacherクラスはTeacherのクラスをinherit
* caluclateSalary() 給料を決めるメソッドを実装する。
*
* 5YearTeacherの給料：ベース給料 x 1.1
* 10YearTeacherの給料：ベース給料 x 1.3
* */

/** Teacherクラス(継承先も含む)を複数作成し、
 *  リストとしてまとめ、最後に全ての情報を表示する。 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 最初に基本給料を決める。
        double baseSalary = 200000.0;

        // 後で全てを回すためTeacherクラスをまとめておく。
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("田中",23,Teacher.GENDAR_MALE,baseSalary));
        teachers.add(new Year5Teacher("鈴木",31,Teacher.GENDAR_FEMALE,baseSalary));
        teachers.add(new Year10Teacher("斉藤",45,Teacher.GENDAR_FEMALE,baseSalary));

        // 情報を全て表示する。
        teachers.forEach(teacher -> Log.d("Teacer_Status",teacher.toString()));
    }
}

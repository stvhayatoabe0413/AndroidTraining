package com.stv.question6;

import android.app.Activity;
import android.os.Bundle;

/* 課題内容
*   abstract Employeeクラスを定義する：
*   名前：String
*   年齢：int
*   性別：boolean
*   住所：String
*   ベース給料：double
*   computeYearlyPay() メソッドを実装する：returnベース 給料
*
*   Programmerクラス、DesignerクラスはEmployeeクラスをlnheritして、定義する：
*   ＋ Desinerクラス：
*   numberOfProjects：int
*   computeYearlyPay() メソッドを実装する：ベース給料 + (10000 * numberOfProjects)
*   ＋ Programmerクラス：
*   numberOfProjects：int
*   rank：char
*   getBonusByRank()メソッドを実装する(return int)：A-->10000；B-->7000；C-->4000
*   computeYearlyPay()メソッドを実装する：ベース給料 + (10000 * numberOfProjects)+
*   getBonusByRank()
* */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

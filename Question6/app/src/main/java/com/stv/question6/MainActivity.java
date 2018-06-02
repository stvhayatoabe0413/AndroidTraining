package com.stv.question6;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


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

/**
 * 抽象クラス Employee クラスを継承したDesignerクラス、Programmerクラスを複数定義し、各給料をログに表示する。 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 共用で使う基本給料
        final double baseSalary = 200000;

        // 後で回すためListとしてまとめておく。
        List<Employee> employees = new ArrayList<>();
        employees.add(new Designer("田中",20,Employee.GENDER_MALE,"千代田区",baseSalary,5));
        employees.add(new Programmer("森田",22,Employee.GENDER_FEMALE,"墨田区",baseSalary,6,'B'));
        employees.add(new Designer("鈴木",32,Employee.GENDER_MALE,"品川区",baseSalary,8));
        employees.add(new Programmer("服部",20,Employee.GENDER_MALE,"葛飾区",baseSalary,4,'C'));
        employees.add(new Programmer("東海林",35,Employee.GENDER_FEMALE,"千代田区",baseSalary,10,'A'));

        // 全員の給料を表示。
        employees.forEach(employee -> Log.d("DisplaySalary",employee.toString()));

    }
}

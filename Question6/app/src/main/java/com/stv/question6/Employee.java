package com.stv.question6;


/**
 * 属性
 *   名前：String
 *   年齢：int
 *   性別：boolean
 *   住所：String
 *   ベース給料：double
 *
 *   computeYearlyPay() メソッドを実装する：returnベース 給料
 *   */
public abstract class Employee {

    // 性別の扱いをわかりやすくするために定数としておく。
    public final static boolean GENDER_MALE = true;
    public final static boolean GENDER_FEMALE = false;

    // ベース給料を返すメソッドを用意するということは、
    // 直接他クラスから要素を編集出来るものではないと
    // 予想されるため、カプセル化しておく。
    // このクラスは継承して使われるのでprotectedとする。
    protected String name;
    protected int age;
    protected boolean gender;
    protected String address;
    protected double baseSalary;

    public abstract double computeYearlyPay();
}

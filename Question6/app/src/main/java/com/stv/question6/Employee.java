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

    // ベース給料を返すメソッドを用意するということは、
    // 直接他クラスから要素を編集出来るものではないと
    // 予想されるため、カプセル化しておく。
    // このクラスは継承して使われるのでprotectedとする。
    protected String name;
    protected int age;
    protected boolean gendar;
    protected String address;
    protected double baseSalary;

    public double computeYearlyPay(){
        return baseSalary;
    }
}

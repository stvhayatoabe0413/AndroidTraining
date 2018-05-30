package com.stv.question5;
/**
 * 要素：<br />
 * 名前：String name
 * 年齢：int age
 * 性別：boolean
 * ベース給料：double
 * */
public class Teacher {

    // 性別はbooleanという指定なので、わかりやすくするために定数で決めておく。
    public static final boolean GENDAR_MALE = true;
    public static final boolean GENDAR_FEMALE = false;

    protected String name;
    protected int age;
    protected boolean gendar;
    protected double baseSalary;
    protected double magnificationToSalary = 1.0;

    /** 継承時はコンストラクタで給料倍率を任意の値で代入すること。*/
    public Teacher(String name,int age,boolean gendar,double baseSalary){
        this.name = name;
        this.age = age;
        this.gendar = gendar;
        this.baseSalary = baseSalary;
    }

    public final double caluclateSalary(){
        return baseSalary * magnificationToSalary;
    }

    /** 名前、年齢、性別、給料を文字列で返す。<br />
     * 例) 田中さん 24歳 男性 の給料は 25000.0円です。 */
    @Override
    public final String toString(){
        String gendarStr = gendar ? "男性":"女性";
        return String.format("%sさん %d歳 %s の給料は %,3.0f円です。",this.name,age,gendarStr,caluclateSalary());
    }

}

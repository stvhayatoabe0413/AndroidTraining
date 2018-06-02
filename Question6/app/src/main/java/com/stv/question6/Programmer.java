package com.stv.question6;

/*
*   ＋ Programmerクラス：
*   numberOfProjects：int
*   rank：char
*   getBonusByRank()メソッドを実装する(return int)：A-->10000；B-->7000；C-->4000
*   computeYearlyPay()メソッドを実装する：ベース給料 + (10000 * numberOfProjects)+
*   getBonusByRank()
*/


import android.util.Log;

public class Programmer extends Employee {

    // 継承するものではないのでprivateとする。
    private int numberOfProjects;
    private char rank;

    public Programmer(String name,int age,boolean gender,String address,double baseSalary,int numberOfProjects,char rank){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
        this.rank = rank;
    }

    private int getBonusByRank(){
        switch (this.rank) {
            case 'A':
                Log.d("Programmer getBonusByRank","caseA");
                return 10000;
            case 'B':
                Log.d("Programmer getBonusByRank","caseB");
                return 7000;
            case 'C':
                Log.d("Programmer getBonusByRank","caseC");
                return 4000;
            default:
                Log.w("Programmer getBonusByRank","rankの値が不正です。0を返します。");
                return 0;
        }
    }

    @Override
    public double computeYearlyPay() {
        return this.baseSalary + (10000d * this.numberOfProjects) + this.getBonusByRank();
    }

    @Override
    public String toString(){
        String genderStr = gender ? "男性" : "女性";
        return String.format("%sさん %d歳 プログラマー %s 住所:%s ランク%c の給料は %,3.0f円です。",name,age,genderStr,this.address,this.rank,this.computeYearlyPay());
    }
}

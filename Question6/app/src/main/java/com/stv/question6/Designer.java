package com.stv.question6;

/*
*   ＋ Desinerクラス：
*   numberOfProjects：int
*   computeYearlyPay() メソッドを実装する：ベース給料 + (10000 * numberOfProjects)
*/

/** @see com.stv.question6.Employee  */
public class Designer extends Employee {

    // 継承するものではないのでprivateに。
    private int numberOfProjects;

    public Designer(String name,int age,boolean gender,String address,double baseSalary,int numberOfProjects){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double computeYearlyPay(){
        return this.baseSalary + (10000d * this.numberOfProjects);
    }

    @Override
    public String toString(){
        String genderStr = gender ? "男性" : "女性";
        return String.format("%sさん %d歳 デザイナー %s 住所:%s の給料は %,3.0f円です。",name,age,genderStr,this.address,this.computeYearlyPay());
    }
}

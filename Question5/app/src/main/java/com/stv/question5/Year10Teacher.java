package com.stv.question5;

public class Year10Teacher extends Teacher {

    /** 給料の倍率は1.3倍。 */
    public Year10Teacher(String name,int age,boolean gendar,double baseSalary){
        super(name,age,gendar,baseSalary);
        super.magnificationToSalary = 1.3;
    }
}

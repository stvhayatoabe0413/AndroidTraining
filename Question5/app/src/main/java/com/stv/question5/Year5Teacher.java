package com.stv.question5;

public class Year5Teacher extends Teacher {

    /** 給料の倍率は1.1倍。 */
    public Year5Teacher(String name,int age,boolean gendar,double baseSalary){
        super(name,age,gendar,baseSalary);
        super.magnificationToSalary = 1.1;
    }
}

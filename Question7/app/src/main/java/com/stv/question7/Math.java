package com.stv.question7;

import android.util.Log;

public class Math {

    int a;
    int b;
    Result result;

    /** 結果をResultにパスするためにResultを受け取っている。 */
    public Math(int a,int b,Result result){
        this.a = a;
        this.b = b;
        this.result = result;
    }

   public void calculate(){
        int resultValue = this.a + this.b;
        this.result.result(resultValue);
   }
}

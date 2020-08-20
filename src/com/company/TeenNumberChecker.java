package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        boolean result;
        if(isTeen(num1) || isTeen(num2) || isTeen(num3)){
            result= true;
        }
        else{
            result= false;
        }
        return result;
    }

    public static boolean isTeen(int num){
        boolean result;
        if(num>=13 && num<=19){
            result= true;
        }
        else{
            result=false;
        }
        return result;
    }
}

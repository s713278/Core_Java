package com.interfacelambdahw;


public class CalculatorInterfaceImpl {

    public static void main(String[] args){

        Calculator add = (a, b) -> a+b;
        Integer res = add.arithmetic(100, 75);
        System.out.println("Addition ---> " + res);

        Calculator subtract = (a, b) -> a-b;
        Integer res2 = subtract.arithmetic(100, 75);
        System.out.println("Subtraction ---> " + res2);
    }
}

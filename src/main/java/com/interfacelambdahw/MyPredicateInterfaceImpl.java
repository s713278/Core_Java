package com.interfacelambdahw;

import java.util.Arrays;
import java.util.List;
public class MyPredicateInterfaceImpl {

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        MyPredicate evenOdd = (condition) -> condition % 2 ==0;
        nums.forEach((num) -> {
            Boolean res = evenOdd.trueFalse(num);
            if(res == true){
                System.out.println("even ---> " + num);
            } else {
                System.out.println("odd ---> " + num);
            }

        });

    }
}


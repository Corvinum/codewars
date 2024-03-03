package com.codewars.kata.transformtoprime;

import java.util.ArrayList;

public class minimumNumber {
    public static void main(String[] args) {
        minimumNumber(new int[]{3,1,2});
    }
    static int minimumNumber (int[] numbers) {
        int result = 0;
        int counter = 0;
        //LOOP FOR SUM
        for (int i = 0; i < numbers.length; i++) {result += numbers[i] ;}

        for (int i = result; counter != 2; i++){
            counter = 0;
            System.out.println(i);
            for (int j = i; counter < 3 && j>0; j-- ) {
                if (i % j == 0) {
                    counter++;
                }
            }
        if(counter == 2)result=i-result;
        }
        System.out.println("FINAL: "+result);
        return result;
    }
}
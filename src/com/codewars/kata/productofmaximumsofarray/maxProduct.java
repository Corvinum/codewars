package com.codewars.kata.productofmaximumsofarray;

import java.util.ArrayList;
import java.util.List;

public class maxProduct {
    public static void main(String[] args){
        maxProduct(new int[]{4,3,5}, 2);
    }
    static long maxProduct(int[] numbers, int sub_size){
        long result = 1;
        int temp = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[i]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        temp = 1;

        while (temp <= sub_size){
            result *= numbers[numbers.length-temp];
            temp++;
        }
        System.out.println(result);
        return result;
    }

}

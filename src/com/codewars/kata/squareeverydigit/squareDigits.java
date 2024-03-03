package com.codewars.kata.squareeverydigit;

import java.util.ArrayList;

public class squareDigits {
    public static void main (String[] args){
        System.out.println(squareDigits(9119));
    }
    static int squareDigits(int n) {
        String result = "";
        for(char digit : String.valueOf(n).toCharArray()) {
            System.out.println(Character.getNumericValue(digit) + ": " + Math.pow(Character.getNumericValue(digit),2));
            result += (int) Math.pow(Character.getNumericValue(digit),2);
        }

    return Integer.valueOf(result);
    }
}
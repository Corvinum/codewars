package com.codewars.kata.reverseanumber;

public class reverse {
    static int reverse(int n){
        int result = 0;
        while(n!=0){
            int auxiliary = n%10;
            result = result * 10 + auxiliary;
            n /= 10;
        }
        return result;
    }
}

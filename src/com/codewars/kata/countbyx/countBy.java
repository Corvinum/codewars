package com.codewars.kata.countbyx;

public class countBy {
    public static int[] countBy(int multiplier, int n){
        int[] AUX = new int[n];
        for (int i = 0; i<n; i++){
            AUX[i] = multiplier * (i+1);
        }
        return AUX;
    }
}

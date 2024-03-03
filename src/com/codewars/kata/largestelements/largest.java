package com.codewars.kata.largestelements;

import static java.util.Arrays.copyOfRange;

public class largest {
    public static void main(String[] args) {
        System.out.println(largest(2, new int[]{1, 2, 3, 4, 5, 6}));
    }
    public static int[] largest(int n, int[] arr) {
        int[] result = new int[n];
        int AUX=0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]) {
                    AUX = arr[i];
                    arr[i] = arr[j];
                    arr[j] = AUX;
                }
            }
        }
        AUX=0;
        while (AUX<n){
            result[AUX] = arr[arr.length-(AUX+1)];
            AUX++;
        }
        for (int i = 0; i < result.length; i++){
            for (int j = i + 1; j < result.length; j++){
                if(result[j] < result[i]) {
                    AUX = result[i];
                    result[i] = result[j];
                    result[j] = AUX;
                }
            }
        }
        return result;
    }
}


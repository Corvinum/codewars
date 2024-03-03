package com.codewars.kata.mergingsortedintegerarrayswithoutduplicates;

import java.util.HashSet;

public class mergeArrays {
    public static void main(String[] args) {
        mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
    }
    static int[] mergeArrays(int[] first, int[] second) {
        int temp = 0;
        HashSet<Integer> noDuplicated = new HashSet<>();

        for (int n : first)noDuplicated.add(n);
        for (int n : second) noDuplicated.add(n);

        int counter = 0;
        int[] arr = new int[noDuplicated.size()];
        for (int n : noDuplicated ) arr[counter++]+=n;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int n : arr)System.out.print(n);
        return arr;
    }
}

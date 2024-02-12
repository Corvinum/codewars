package com.codewars.kata.sumofarraysingles;

public class repeat {
    static int repeats(int[] arr){
        int result = 0;
        boolean isReapeated;

        for(int i = 0; i < arr.length; i++){
            isReapeated = false;
            for(int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j] && j != i){
                    isReapeated = true;
                    break;
                }
            }
            if (!isReapeated){
                result += arr[i];
            }
        }
        return result;
    }
}

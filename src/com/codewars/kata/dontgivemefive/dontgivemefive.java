package com.codewars.kata.dontgivemefive;

public class dontgivemefive {
    public static int dontGiveMeFive(int start, int end) {
        int result = 0;
        do{
            if (String.valueOf(start).contains("5")) {
                start++;
                continue;
            }
            result++;
            start++;
        } while (start <= end);
        return result;

    }
}

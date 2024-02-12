package com.codewars.kata.snailcrawlsup;

public class snail {
    static int snail(int column, int day, int night){
        int days = 0;
        while(column>0) {
            days++;
            column -= day;
            if(column > 0) {
                column += +night;
            }
        }
        return days;
    }
}

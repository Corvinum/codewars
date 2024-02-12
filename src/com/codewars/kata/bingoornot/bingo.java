package com.codewars.kata.bingoornot;

public class bingo {
    static String bingo(int[] numberArray){
        int AUX = 0;
        int[] bingo = {2, 9, 14, 7, 15,};
        for (int i = 0; i < numberArray.length; i++) {
            for(int j=0; j < bingo.length; j++) {
                if (numberArray[i] == bingo[j]) bingo[j] = 0;
            }
        }
        for(int nBingo : bingo) {
            AUX += nBingo;
        }
        return AUX!=0 ? "LOSE" : "WIN";
    }
}
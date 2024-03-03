package com.codewars.kata.allstarcodechallenge18;

public class strCount {
    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'o'));
    }

    public static int strCount(String str, char letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }
}
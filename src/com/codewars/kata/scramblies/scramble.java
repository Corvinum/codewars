package com.codewars.kata.scramblies;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class scramble {
    public static void main(String[] args) {
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
    }
    static boolean scramble(String str1, String str2){
        for (char c : str2.toCharArray()) {
            if (str1.contains(String.valueOf(c))) {
                str1 = str1.replaceFirst(String.valueOf(c), "");
            } else {
                return false;
            }
        }
        return true;
    }
}
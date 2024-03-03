package com.codewars.kata.pianokatapart1;

public class blackOrWhiteKey {
    public static void main(String[] args) {
        System.out.println(blackOrWhiteKey(88));
    }
    static String blackOrWhiteKey(int keyPressCount) {
        String[] keys = {
            "white", "black", "white", "white","black","white","black","white","white","black","white","black","white","black", "white"
                , "white","black","white","black","white","white","black","white","black","white","black", "white"
                , "white","black","white","black","white","white","black","white","black","white","black", "white"
                , "white","black","white","black","white","white","black","white","black","white","black", "white"
                , "white","black","white","black","white","white","black","white","black","white","black", "white"
                , "white","black","white","black","white","white","black","white","black","white","black", "white"
                , "white","black","white","black","white","white","black","white","black","white","black", "white", "white"
        };
        int index = (keyPressCount-1) % keys.length;
        return keys[index];
    }
}

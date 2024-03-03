package com.codewars.kata.basicencryption;

public class encrypt {
    public static void main(String[] args){
        encrypt("mllx", 447);
    }
    static String encrypt(String text, int rule) {
        char[] characters = text.toCharArray();
        String result = "";
        int i = 0;

        for ( char letter : characters) {
            char encryptedChar = (char) ((letter + rule) % 256);
            result += Character.toString(encryptedChar);
        }
        return result;
    }
}
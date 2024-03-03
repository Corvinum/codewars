package com.codewars.kata.creditcardmask;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }
    static String maskify(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length - 4; i++) chars[i] = '#';

        str = new String(chars);

        return str;
    }
}

package com.codewars.kata.createphonenumber;

public class createPhoneNumber {
    public static void main (String[] args){
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    static String createPhoneNumber(int[] numbers) {
        int counter = 0;
        String result = "(";

        for (int n: numbers) {
            System.out.println(n);

            if (counter < 3) {
                result += n;
                if (counter == 2) {
                    result += ") ";
                }
            } else if (counter == 6) {
                result += "-";
                result += n;
            } else {
                result += n;

            }
            counter++;
        }
        return result;
    }
}

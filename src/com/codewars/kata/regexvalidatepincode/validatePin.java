package com.codewars.kata.regexvalidatepincode;

public class validatePin {
    public static boolean validatePin(String pin){
        return pin.matches("\\d{4,6}");
    }
}

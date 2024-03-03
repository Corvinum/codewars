package com.codewars.kata.creditcardissuerchecking;

public class getIssuer {
    public static void main(String[] args) {
        System.out.println(getIssuer("9111111111111111"));
    }
    static String getIssuer(String cardNumber) {
        System.out.println(cardNumber.length());
        if (cardNumber.matches("^(34|37).+") && cardNumber.length() == 15) return "AMEX";
        else if (cardNumber.matches("^6011.+") && cardNumber.length() == 16) return "Discover";
        else if (cardNumber.matches("^(51|52|53|54|55).+") && cardNumber.length() == 16) return "Mastercard";
        else if (cardNumber.matches("^4.+") && cardNumber.length() == 13 || cardNumber.matches("^4.+") && cardNumber.length() == 16) return "VISA";
        return "Unknown";
    }
}

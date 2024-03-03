package com.codewars.kata.thefeastofmanybeasts;

public class feast {
    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
    }
    static boolean feast(String beast, String dish) {
        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1)) return true;
        return false;
    }
}

package com.codewars.kata.welcometothecity;

public class sayHello {
    static String sayHello(String[] name, String city, String state) {
        String sentence = "Hello, ";
        int counter = 0;
        System.out.println(name.length);
        while (counter != name.length) {
            sentence += name[counter] + (counter == name.length - 1 ? "" : " ");
//            "Hello, " + name[0]+" "+ name[1] +
            counter++;
        }
        ;
        return sentence + "! Welcome to " + city + ", " + state + "!";
    }
}
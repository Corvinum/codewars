package com.codewars.kata.removestringspaces;

public class noSpace {
    public static void main(String[] args) {
        System.out.println(noSpace("Hlello World"));
    }
    static String noSpace(final String x) {
        return x.replaceAll(" ","");
    }
}

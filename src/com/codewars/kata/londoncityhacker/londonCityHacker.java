package com.codewars.kata.londoncityhacker;
import java.util.Locale;
public class londonCityHacker {
    public static void main(String[] args) {
        System.out.println(londonCityHacker(new Object[] {386, 56, 1, 876}));
    }
    static String londonCityHacker(Object[] journey){
        double result=0;

        for (int i = 0; i < journey.length; i++) {
            if (journey[i] instanceof Integer) {
                if (i+1 < journey.length && journey[i+1] instanceof Integer) {
                    i++;
                    result += 1.5;
                }
                else result += 1.5;

            }
            if (journey[i] instanceof String) {
                result += 2.4;
            }
        }
        return  "£"+String.format(Locale.ENGLISH,"%.2f",result);
    }
}

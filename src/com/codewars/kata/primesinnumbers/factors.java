package com.codewars.kata.primesinnumbers;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        System.out.println(factor(7775460)); // "2^5*5*7^2*11"
    }
    static String factor(int n){
        ArrayList<Integer> prime = new ArrayList<>();
        String result = "";
        int count = 1;

        for (int i = 2; i <= n; i++){
            for (int j = 0; n % i == 0 && n != 1; j++){
                prime.add(i);
                n/=i;
            }
        }
        for (int i= 0; i < prime.size();i++){

            if (i != prime.size()-1 && prime.get(i).equals(prime.get(i+1))) {
                count++;
                continue;
            }
            if (count == 1) result += ("(" + prime.get(i) + ")");
            else if (count > 1)  {
                result += ("(" + prime.get(i) + "**" + count + ")");
                count = 1;
            }
        }
        return result;
    }
}

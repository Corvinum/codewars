package com.codewars.kata.countthesmileyfaces;
import java.util.List;
import java.util.ArrayList;

public class countSmileys {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        System.out.println(countSmileys(a));
    }
    static int countSmileys(List<String> arr) {
        int counter = 0;
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i).matches("(:|;)(~|-)?(\\)|D)"))counter++;
            }
        return counter;
    }
}

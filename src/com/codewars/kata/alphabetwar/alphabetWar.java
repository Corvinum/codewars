package com.codewars.kata.alphabetwar;
import java.util.HashMap;
public class alphabetWar {
    public static void main(String[] args) {
        alphabetWar("z");
    }
    static String alphabetWar(String fight) {
        HashMap<Character, Integer> powerMap = new HashMap<>();
        powerMap.put('w', -4);
        powerMap.put('p', -3);
        powerMap.put('b', -2);
        powerMap.put('s', -1);

        powerMap.put('m', 4);
        powerMap.put('q', 3);
        powerMap.put('d', 2);
        powerMap.put('z', 1);

        int acum = 0;

        for (char c : fight.toCharArray()) {
            if (powerMap.containsKey(c)) acum += powerMap.get(c);
        }
        return acum < 0 ? "Left side wins!" : acum > 0 ?"Right side wins!" : "Let's fight again!";
    }
}

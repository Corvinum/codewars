package com.codewars.kata.catkatapt1;

public class yard {
    static boolean isYardPeaceful(String[] yard, int minDistance) {
        int catCounter = 0;
        int[][] coordsCat = new int[3][2];

        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[i].length(); j++) {
                if (yard[i].charAt(j) != '-') {
                    coordsCat[catCounter][0] = i;
                    coordsCat[catCounter][1] = j;
                    catCounter++;
                }
            }
        }
        if (catCounter <= 1) {
            return true;
        } else {
            for (int i = 0; i < catCounter - 1; i++) {
                for (int j = i + 1; j < catCounter; j++) {
                    double result = distanceEuclid(coordsCat[i][0], coordsCat[i][1], coordsCat[j][0], coordsCat[j][1]);
                    if (result < minDistance) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    static double distanceEuclid(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}
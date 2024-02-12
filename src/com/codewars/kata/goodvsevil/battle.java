package com.codewars.kata.goodvsevil;
public class battle {
    static String battle(String goodAmounts, String evilAmounts) {
        //SE QUE SE PUEDE HACER CON METODOS CORTOS COMO SPLIT, PERO QUERIA COMPLICARMELO
        //Variables acumuladoras de la suma
        int goodSum = 0;
        int evilSum = 0;
        //Variable encargada de guardar el beneficio de las razas
        int[] goodArr = new int[6];
        int[] evilArr = new int[7];

        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};

        String goodAUX = "";
        String evilAUX = "";
        int counterChar = 0;
        int counterArr = 0;
        //WHILE de GOOD
        while (counterChar <= goodAmounts.length()) {
            if(counterChar == goodAmounts.length()) {
                goodArr[counterArr] = Integer.parseInt(goodAUX);
                counterArr = 0;
                while (counterArr < goodArr.length) {
                    goodSum += goodArr[counterArr] * goodWorth[counterArr];
                    counterArr++;
                }
                break;
            } else if (goodAmounts.charAt(counterChar) != ' ') {
                goodAUX += goodAmounts.charAt(counterChar);
            } else {
                goodArr[counterArr] = Integer.parseInt(goodAUX);
                goodAUX = "";
                counterArr++;
            }
            counterChar++;
        }
        counterChar = 0;
        counterArr = 0;
        //WHILE de EVIL
        while (counterChar <= evilAmounts.length()) {
            if(counterChar == evilAmounts.length()) {
                evilArr[counterArr] = Integer.parseInt(evilAUX);
                counterArr = 0;
                while (counterArr < evilArr.length) {
                    evilSum += evilArr[counterArr] * evilWorth[counterArr];
                    counterArr++;
                }
                break;
            } else if (evilAmounts.charAt(counterChar) != ' ') {
                evilAUX += evilAmounts.charAt(counterChar);
            } else {
                evilArr[counterArr] = Integer.parseInt(evilAUX);
                evilAUX = "";
                counterArr++;
            }
            counterChar++;
        }
        if (goodSum > evilSum) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilSum > goodSum) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return ("Battle Result: No victor on this battle field");
        }
    }
}
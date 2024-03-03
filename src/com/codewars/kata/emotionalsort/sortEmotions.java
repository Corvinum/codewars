package com.codewars.kata.emotionalsort;

import java.util.HashMap;

public class sortEmotions {
    static String[] sortEmotions(String[] emotions, boolean order ) {
        HashMap<String, Integer> emotionsMap = new HashMap<>();
        emotionsMap.put(":(", 1);
        emotionsMap.put("T_T", 0);
        emotionsMap.put(":|", 2);
        emotionsMap.put(":)", 4);
        emotionsMap.put(":D", 5);
        if (order){
            for (int i = 0;  i < emotions.length; i++) {
                for (int j = i +1; j < emotions.length; j++) {
                    if(emotionsMap.get(emotions[j]) > emotionsMap.get(emotions[i]) ) {
                        String temp = emotions[i];
                        emotions[i] = emotions[j];
                        emotions[j] = temp;

                    }
                }
            }
        } else {
            for (int i = 0;  i < emotions.length; i++) {
                for (int j = i +1; j < emotions.length; j++) {
                    if(emotionsMap.get(emotions[j]) < emotionsMap.get(emotions[i]) ) {
                        String temp = emotions[i];
                        emotions[i] = emotions[j];
                        emotions[j] = temp;
                    }
                }
            }
        }
        for (String emotion : emotions) {
            System.out.println(emotion);
        }
        return emotions;
    }
}
package com.codewars.kata.connect4;

import java.util.HashMap;

public class Connect4 {
    public static int[][] grid = new int[6][7];
    //SOLO EXISTEN 2 JUGADORES, si no es el 2, sera el 1.
    public static boolean isPlayer2 = false;
    public static boolean gameOver = false;

    public static void main(String[] args) {
        play(1);
        play(1);
        play(1);
        play(1);
        play(1);
        play(1);
        play(1);
    }

    static String play(int column) {
        System.out.println("Inicio");
        playerTurn();
        columnFree(column);


        return "";
    }
    static boolean columnFree(int column) {

        for (int i = 0 ; i < grid.length; i++){
            if (grid[i][column] == 0){
                if (!isPlayer2)grid[i][column] = 1;
                if (isPlayer2)grid[i][column] = 2;
                System.out.println("Vuelta " + i);
                return true;
            }
`¡`
            System.out.println(grid[i][column]);

        }
        return false;
    }
    static void playerTurn();

}
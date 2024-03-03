package com.codewars.kata.snailsort;

public class snail {
    public static void main(String[] args) {
        int[][] test =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                };
        snail(test);
    }

        static int[] snail(int[][] array) {
            int[] resultado = new int[array[0].length * array.length];
            int a = 0;
            int b = array.length;
            int c = array[0].length;
            int counter = 0;
            //UN IF MUY DE LOCOS
            if (array[0].length == 0 )return new int[]{};

           while (counter < resultado.length){
               //RIGHT->
               for (int i = a; i < c && counter < resultado.length; i++) resultado[counter++] = array[a][i];
               //DOWN
               for (int i = a + 1; i < b && counter < resultado.length; i++) resultado[counter++] = array[i][c-1];
               //LEFT
               for (int i = c - 2; i >= a && counter < resultado.length; i--) resultado[counter++] = array[b - 1][i];
               //UP
               for (int i = b - 2; i > a && counter < resultado.length; i--) resultado[counter++] = array[i][a];
               a++; b--; c--;
           }
            return resultado;
        }
}
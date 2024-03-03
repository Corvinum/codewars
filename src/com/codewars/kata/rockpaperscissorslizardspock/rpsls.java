package com.codewars.kata.rockpaperscissorslizardspock;
public class rpsls {
    static String rpsls(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Draw!";
        }

        switch (player1) {
            case "rock":
                if (player2.equals("scissors") || player2.equals("lizard")) {
                    return "Player 1 Won!";
                }
                break;
            case "paper":
                if (player2.equals("rock") || player2.equals("spock")) {
                    return "Player 1 Won!";
                }
                break;
            case "scissors":
                if (player2.equals("paper") || player2.equals("lizard")) {
                    return "Player 1 Won!";
                }
                break;
            case "lizard":
                if (player2.equals("spock") || player2.equals("paper")) {
                    return "Player 1 Won!";
                }
                break;
            case "spock":
                if (player2.equals("scissors") || player2.equals("rock")) {
                    return "Player 1 Won!";
                }
                break;
        }

        return "Player 2 Won!";
    }
}
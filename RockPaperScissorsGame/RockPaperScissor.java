package RockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    final static int ROCK = 0, SCISSOR = 2, PAPER = 1;
    public static void main(String[] args){
        System.out.println("This game is for 2 Players...... \n\n Player 1 is System \n\n");
        Scanner sc = new Scanner(System.in);
        String player1 = "System";
        System.out.println("Please enter Player 2 name");
        String player2 = sc.nextLine();
        System.out.println("Let's start the game.....\n\n");
        
        Random rr = new Random();
        int player1Input = rr.nextInt(2);
        System.out.println("Player 2 enter your choice : 0 - Rock, 1 - Paper, 2 - Scissor.");
        int player2Input = sc.nextInt();

        if (player1Input == player2Input){
            System.out.println("There is a tie");
        }
        else {

            switch(player1Input){
                case ROCK -> {
                    if (player2Input == PAPER)
                        System.out.println(player2+" Wins!!!!!!!!!");
                    else
                        System.out.println(player1+" Wins!!!!!!!!!");
                }

                case SCISSOR -> {
                    if (player2Input == ROCK)
                        System.out.println(player2+" Wins!!!!!!!!!");
                    else
                        System.out.println(player1+" Wins!!!!!!!!!");
                }

                case PAPER -> {
                    if (player2Input == SCISSOR)
                        System.out.println(player2+" Wins!!!!!!!!!");
                    else
                        System.out.println(player1+" Wins!!!!!!!!!");
                }

            }


        }

    }

}

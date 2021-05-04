package RockPaperScissorsGame;

import java.util.Scanner;

public class RockPaperScissor {

    final static int ROCK = 1, SCISSOR = 3, PAPER = 2;
    public static void main(String[] args){
        System.out.println("This game is for 2 Players...... \n\n Please enter Player 1 name");
        Scanner sc = new Scanner(System.in);
        String player1 = sc.nextLine();
        System.out.println("Please enter Player 2 name");
        String player2 = sc.nextLine();
        System.out.println("Let's start the game.....\n\n");

        System.out.println("Player 1 enter your choice : 1 - Rock, 2 - Paper, 3 - Scissor.");
        int player1Input = sc.nextInt();
        System.out.println("Player 2 enter your choice : 1 - Rock, 2 - Paper, 3 - Scissor.");
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

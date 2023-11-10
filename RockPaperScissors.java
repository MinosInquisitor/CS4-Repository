/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cs4.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rtmuro
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int playerWins = 0;
            int computerWins = 0;
            int roundsToWin = 2;
            
            
            // Create moves
            Move rock = new Move("Rock");
            Move paper = new Move("Paper");
            Move scissors = new Move("Scissors");
            
            // Set move strengths
            rock.setStrongAgainst(scissors);
            paper.setStrongAgainst(rock);
            scissors.setStrongAgainst(paper);
            
            OUTER:
            while (true) {
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit application");
                System.out.println(">");
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1 -> {
                        System.out.println("This match will be first to " + roundsToWin + " wins.");
                        while (playerWins < roundsToWin && computerWins < roundsToWin) {
                            int computerMoveIndex = random.nextInt(3);
                            Move computerMove = null;
                            
                            switch (computerMoveIndex) {
                                case 0 -> computerMove = rock;
                                case 1 -> computerMove = paper;
                                case 2 -> computerMove = scissors;
                            }
                            
                            System.out.println("The computer has selected its move. Select your move:");
                            System.out.println("1. Rock");
                            System.out.println("2. Paper");
                            System.out.println("3. Scissors");
                            System.out.println(">");
                            int playerMoveIndex = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline
                            Move playerMove = null;
                            
                            switch (playerMoveIndex) {
                                case 1 -> playerMove = rock;
                                case 2 -> playerMove = paper;
                                case 3 -> playerMove = scissors;
                                default -> {
                                    System.out.println("Invalid move. Please choose a valid move.");
                                    continue;
                                }
                            }
                            
                            int result = Move.compareMoves(playerMove, computerMove);
                            
                            switch (result) {
                                case 0 -> {
                                    playerWins++;
                                    System.out.println("Player chose " + playerMove.getName() + ". Computer chose " + computerMove.getName() + ". Player wins round!");
                                }
                                case 1 -> {
                                    computerWins++;
                                    System.out.println("Player chose " + playerMove.getName() + ". Computer chose " + computerMove.getName() + ". Computer wins round!");
                                }
                                default -> System.out.println("Player chose " + playerMove.getName() + ". Computer chose " + computerMove.getName() + ". Round is tied!");
                            }
                            
                            System.out.println("Player: " + playerWins + " - Computer: " + computerWins);
                        }   if (playerWins > computerWins) {
                            System.out.println("Player wins!");
                        } else {
                            System.out.println("Computer wins!");
                        }   // Reset scores
                        playerWins = 0;
                        computerWins = 0;
                    }
                    case 2 -> {
                        System.out.print("How many wins are needed to win a match? ");
                        roundsToWin = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        System.out.println("New setting has been saved!");
                    }
                    case 3 -> {
                        System.out.println("Thank you for playing!");
                        break OUTER;
                    }
                    default -> System.out.println("Invalid option. Please choose a valid option.");
                }
            }
        }
    }
}
    
 
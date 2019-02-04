package com.company;


import java.util.Random;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Random rand = new Random();
            int score = 0;
            boolean answer;


            Scanner keyboard = new Scanner(System.in);
            System.out.println("WELCOME! Let's play some Roulette!");


           do {
               System.out.print("Enter the amount of money" + "type of bet you would like to place (even|odd|high|low");
               String bet = keyboard.next();

               System.out.println("enter your bet amount");
               int amount = keyboard.nextInt();

               int index = 1 + rand.nextInt(36);
               System.out.println("The ball landed on " + index);

               if (index >= 1 && index <= 18 && bet.equalsIgnoreCase("low")) {
                   score = score + (amount * 2);
                   System.out.println("Congratulations, you've won");
                   System.out.println("You currently have" + score);
               } else if (index >= 19 && index <= 36 && bet.equalsIgnoreCase("high")) {
                   score = score + (amount * 2);
                   System.out.println("Congratulations, you've won");
                   System.out.println("You currently have" + score);

               } else if (index % 2 == 0 && bet.equalsIgnoreCase("even")) {
                   score = score + (amount * 2);
                   System.out.println("Congratulations, you've won");
                   System.out.println("You currently have" + score);

               } else if (index % 2 != 0 && bet.equalsIgnoreCase("odd")) {
                   score = score + (amount * 2);
                   System.out.println("Congratulations, you've won");
                   System.out.println("You currently have" + score);
               } else {
                   score = score - (amount);
                   System.out.println("Sorry, you've lost this bet");
                   System.out.println("You currently have" + score);
               }
               System.out.println ("Would you like to play again (true|false)?");
                answer = keyboard.nextBoolean();

           }while (answer==true);
            System.out.println("Thank you for playing!\n" +
                    "This is how much money you have remaining"+ score);




            }



        }



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lottery_using_strings;

/**
 *
 * @author Mukisa
 */
import java.util.Scanner;
public class Lottery_Using_Strings {

    public static void main(String[] args) {
         String lottery = String.valueOf((int)(Math.random() * 1000));
        
        // Ensure lottery number is always 3 digits by padding with leading zeros
        while (lottery.length() < 3) {
            lottery = "0" + lottery;
        }

        // Ask user for their guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        String guess = input.nextLine();

        // Display the lottery number
        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery)) {
            System.out.println("Exact match: You win $10,000!");
        } 
        else if (containsAllDigits(lottery, guess)) {
            System.out.println("Match all digits: You win $3,000!");
        } 
        else if (containsAnyDigit(lottery, guess)) {
            System.out.println("Match one digit: You win $1,000!");
        } 
        else {
            System.out.println("Sorry, no match.");
        }

        input.close();
    }

    // Check if all digits are present regardless of order
    private static boolean containsAllDigits(String lottery, String guess) {
        for (int i = 0; i < guess.length(); i++) {
            if (!lottery.contains(String.valueOf(guess.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    // Check if at least one digit matches
    private static boolean containsAnyDigit(String lottery, String guess) {
        for (int i = 0; i < guess.length(); i++) {
            if (lottery.contains(String.valueOf(guess.charAt(i)))) {
                return true;
            }
        }
        return false;

    }
}

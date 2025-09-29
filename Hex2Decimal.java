/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hex2decimal;

/**
 *
 * @author Mukisa
 */
import java.util.Scanner;
public class Hex2Decimal {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a hexadecimal digit (0-9 or A-F): ");
        String hex = input.nextLine();

        // Check if input is valid
        if (hex.length() != 1) {
            System.out.println("Invalid input. Please enter only one character.");
            return;
        }

        char ch = hex.charAt(0);
        int decimalValue = 0;

        // If character is 0-9
        if (ch >= '0' && ch <= '9') {
            decimalValue = ch - '0';
        }
        // If character is A-F or a-f
        else if (ch >= 'A' && ch <= 'F') {
            decimalValue = 10 + (ch - 'A');
        } 
        else if (ch >= 'a' && ch <= 'f') {
            decimalValue = 10 + (ch - 'a');
        }
        else {
            System.out.println("Invalid hexadecimal digit.");
            return;
        }

        // Print result
        System.out.println("The decimal value of " + ch + " is " + decimalValue);
    
    }
}

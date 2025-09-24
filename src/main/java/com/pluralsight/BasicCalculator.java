package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        //here is my scanner
        Scanner scanner = new Scanner(System.in);
        //there's my scanner

        System.out.println("Your Majesty, what is thine first number?");
        float number1 = scanner.nextFloat();
        scanner.nextLine();//CRLF
        System.out.println("Verily.");

        //second number
        System.out.println("What is thine second number?");
        float number2 = scanner.nextFloat();
        scanner.nextLine();//CRLF
        System.out.println("Of course.");

        //now what?
        System.out.println("What operation shall I perform for you my liege? I can:\n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\n Please, do be merciful and keep in mind I only know how to multiply.");
        String operation = scanner.nextLine();
        System.out.println("What was that your Excellency? Multiplication? For joy!\nI will calculate this with the utmost urgency.");

        //my solution
        double solution = number1*number2;
        System.out.printf("My liege, in your exacting wisdom you entrusted me to multiply the numbers of %.2f and %.2f.\nThe solution of which is %.2f. Have I served you well on this day?",number1,number2,solution);
        String service = scanner.nextLine();
        System.out.printf("%s? Thy will be done your Majesty. Huzzah!",service);


    }
}

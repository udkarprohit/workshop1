package com.bridgelabz;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int i, fact = 1;
        int number = scanner.nextInt();//It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

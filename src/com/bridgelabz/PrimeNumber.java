package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int primeNumber = sc.nextInt();
        int i, m = 0, flag = 0;
        m = primeNumber / 2;
        if (primeNumber == 0 || primeNumber == 1) {
            System.out.println(primeNumber + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (primeNumber % i == 0) {
                    System.out.println(primeNumber + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(primeNumber + " is prime number");
            }
        }
    }
}

package com.costaroot.safedivision;

import java.util.Scanner;

public class SafeDivision {
    private Scanner scanner;
    private int numberA;
    private int numberB;

    public SafeDivision() {
        scanner = new Scanner(System.in);
        this.scanNumbers();
    }

    private void scanNumbers() {
        System.out.println("Please type two numbers.");
        try {
            numberA = scanner.nextInt();
            numberB = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You entered not numbers!");
        }
    }

    private void rescanNumberB() {
        System.out.println("Please not Zero number");
        try {
            numberB = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Not number");
        }
    }

    public double divisionNumbers() {
        do {
            try {
                return numberA / numberB;
            } catch (ArithmeticException e) {
                System.out.println("Division by zero!");
                this.rescanNumberB();
            }
        } while (numberB == 0);
        return numberA / numberB;
    }
}

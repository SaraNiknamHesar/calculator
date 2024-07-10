package com.example.calculator;

import java.util.Scanner;

public class Main extends CalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int numberOne = scanner.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the desired operand");
        String operand = scanner.nextLine();
        operandChecker(operand, numberOne, numberTwo);
    }
}

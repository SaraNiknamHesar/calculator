package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
    public static void main(String[] args) {

    }

    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int division(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int mod(int numberOne, int numberTwo) {
        return numberOne % numberTwo;
    }

    public static void operandChecker(String operand, int numberOne, int numberTwo) {
        int result;
        if (operand.equals("+")) {
            result = sum(numberOne, numberTwo);
            System.out.println(result);
        } else if (operand.equals("-")) {
            result = minus(numberOne, numberTwo);
            System.out.println(result);
        } else if (operand.equals("/")) {
            result = division(numberOne, numberTwo);
            System.out.println(result);
        } else if (operand.equals("*")) {
            result = multiplication(numberOne, numberTwo);
            System.out.println(result);
        } else if (operand.equals("%")) {
            result = mod(numberOne, numberTwo);
            System.out.println(result);
        }
    }

}

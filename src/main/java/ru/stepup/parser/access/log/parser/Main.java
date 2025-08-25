package ru.stepup.parser.access.log.parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println((double) firstNumber/secondNumber);
    }
}
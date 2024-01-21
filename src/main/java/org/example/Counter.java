package org.example;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int parameterOne = terminal.nextInt();
        System.out.println("Enter the second parameter");
        int parameterTwo = terminal.nextInt();

        try {
            count(parameterOne, parameterTwo);

        }catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }

    }
    static void count(int parameterOne, int parameterTwo ) {
        if(parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }

        int counting = parameterTwo - parameterOne;

        for (int i = 1; i <= counting; i++) {
            System.out.println("Printing the number " + i);
        }
    }
}
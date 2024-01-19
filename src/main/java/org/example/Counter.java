package org.example;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int parametroUm = terminal.nextInt();
        System.out.println("Enter the second parameter");
        int parametroDois = terminal.nextInt();

        try {
            count(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("The second parameter must be greater than the first");
        }

    }
    static void count(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Printing the number " + i);
        }
    }
}
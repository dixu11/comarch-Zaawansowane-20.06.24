package org.example;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak się nazywasz?");
        String name = scanner.nextLine();
        System.out.println("Czołem " + name + "!");
        System.out.println("Idziemy dalej?");
        boolean continueProgram = scanner.nextBoolean();
        if (continueProgram) {
            System.out.println("Działamy!");
        } else {
            System.out.println("Bywaj!");
        }

        System.out.println("Jak masz na nazwisko?");
        //["/n"]
        //scanner.nextLine(); // wyczyszczenie zbędniej dodatkowej linii
        scanner = new Scanner(System.in); // nowy skaner z pustym buforem
        //[]
        String secondName = scanner.nextLine();
        System.out.println(name + " " + secondName);
    }
}


package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("What bed time story do you want to read: ");
            String fileName = scanner.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            int lineNumber = 1;

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            reader.close();
        } catch (Exception ex) {
            System.err.println("Wrong input, Try again.");
        }

    }
}

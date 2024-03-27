package io.zipcoder.polymorphism;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MainApplication {
    public static Scanner scanner = new Scanner(System.in);
    public static Logger logger = Logger.getLogger("Pet List");
    SimpleFormatter logFormatter = new SimpleFormatter();
    FileHandler fh;

    {
        try{
            fh = new FileHandler("Pet_List.csv", true);
            logger.addHandler(fh);
            logger.setLevel(Level.INFO);
            fh.setFormatter(logFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        int numOfPets = scanner.nextInt();
        scanner.nextLine();

        logger.log(Level.INFO, "User has", numOfPets);

        System.out.println("That's cool, what kind of pet(s) do you have?");
        String typePet = scanner.nextLine();
        logger.log(Level.INFO, "Type of pet(s)", typePet);

        System.out.println("What is/are the/their name?");
        String namePet = scanner.nextLine();
        logger.log(Level.INFO, "Name of pet(s):", namePet);

    }
}

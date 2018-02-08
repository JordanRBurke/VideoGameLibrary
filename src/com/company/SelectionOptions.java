package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectionOptions extends Games {


    public void interaction () {
        Scanner input = new Scanner(System.in);

        System.out.println("Please select one of the options below");
        System.out.println(" 1. Add game \n" +
                " 2. Remove game \n" +
                " 3. Check out game \n" +
                " 4. view library \n " +
                "5. Check in game \n" +
                " 6. View checked out games \n" +
                " 7. Exit");

        try {

            switch (input.nextInt()) {
                case 1:
                    System.out.println("Type in a game you would like to add");
                    setGameSaved(input.nextLine());
                    System.out.println(getGameSaved() + " Has been saved! :D");
                    System.out.println("If you would like to add another game please type it out now");
                    setGameSaved2(input.nextLine());
                    break;
                case 2:
                    System.out.println("Which game would you like to remove? \n 1. " + getGameSaved());
                    if (input.nextInt() == 2) {
                        System.out.println("You have removed " + getGameSaved() + "From your game library");
                    }

                case 3:
                    if (input.nextInt() == 3) {

                    }


            }


        } catch (InputMismatchException ime) {
            System.out.println("Error, not recognized \n please select one of the options above");
            interaction();
        }



    }






}
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
                    // Add game outputs/inputs
                    System.out.println("Type in a game you would like to add");
                    input.nextLine();
                    setGameSaved(input.nextLine());
                    System.out.println(getGameSaved() + " Has been saved! :D");
                    System.out.println("If you would like to \n" +
                            " 1. Exit to main menu \n" +
                            " 2. Save new game");
                    if (input.nextInt() == 1) {
                        interaction();
                    } else {
                        System.out.println("Congrats you have saved your second game!");
                    }
                    setGameSaved2(input.nextLine());
                    break;
                case 2:
                    System.out.println("Which game would you like to remove? \n 1. " + getGameSaved());
                    if (input.nextInt() == 1) {
                        System.out.println("You have removed " + getGameSaved() + "From your game library");
                        break;
                    }

                case 3:


                        System.out.println("Which game would you like to check out? \n 1. Fallout Series \n 2. Terraria \n 3. Minecraft \n 4. Skyrim");
                        input.nextLine();
                        if (input.nextLine().equals("Fallout series")) {
                            System.out.println("These are the list of Fallout games avaliable \n 1. Fallout \n 2. Fallout 2 \n 3. Fallout 3 \n 4. Fallout New Vegas \n 5. Fallout 4");
                            switch (input.nextInt()) {
                                case 1:
                                    setCheckedOut("Fallout");
                                    System.out.println("Fallout has been added to checked out games!");
                                    break;
                                case 2:
                                    setCheckedOut("Fallout 2");
                                    System.out.println("Fallout 2 has been added to your checked out games!");
                                    break;
                                case 3:
                                    setCheckedOut("Fallout 3");
                                    System.out.println("Fallout 3 has been added to your checked out list");
                                    break;
                                case 4:
                                    setCheckedOut("Fallout New Vegas");
                                    System.out.println("You have added Fallout New Vegas to your checked out list!");
                                    break;

                            }

                        }
                        break;
                case 4:
                    // List of games you saved in case 1
                    System.out.println("These are your currently added games \n" +
                            " 1. " + getGameSaved() + " \n" +
                            " 2. " + getGameSaved2());
                    System.out.println("Press 3 if you would like to exit to the menu");
                        if (input.nextInt() == 3) {
                            interaction();
                        }
                    break;

                case 5:
                    System.out.println("These are your list of checked out games \n 1. " + getCheckedOut());
                    break;

                case 6:

                    }














            } catch (InputMismatchException ime) {
            System.out.println("Error, not recognized \n please select one of the options above");
            interaction();


        }
        }



    }







package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class SelectionOptions extends Games {

    CheckOutDates checkDates = new CheckOutDates();
    List<String> gameString = new ArrayList();

    public void gameArrayList() {
        /** Array of saved games get by the user */

        gameString.add(getGameSaved());
        gameString.add(getGameSaved2());
        gameString.add(getGameSaved3());


    }


    public void interaction () {
        Scanner input = new Scanner(System.in);
        SelectionOptions gameClass = new SelectionOptions();
        gameClass.gameArrayList();

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat checkOutDate = new SimpleDateFormat("MM/dd/yyyy");
//        System.out.println(checkOutDate.format(calendar.getTime()));
        /** Main selection page (The log of a tree that separates into branches) */
        System.out.println("Please select one of the options below");
        System.out.println(" 1. Add game \n" +
                " 2. Remove game \n" +
                " 3. Check out game \n" +
                " 4. View library \n " +
                "5. Check in game \n" +
                " 6. View checked out games \n" +
                " 7. Exit");

        try {

            switch (input.nextInt()) {
                case 1:
                    gameClass.gameArrayList();

                    /** Adds a game and sets it so the code can respond and keep
                     *  what the user has typed in for later responses.
                     */
                    System.out.println("Type in a game you would like to add");
                    input.nextLine();
                    gameString.add(input.nextLine());
//                    setGameSaved(input.nextLine());
//                    gameString.get(0);
                    System.out.println(gameString.get(0) + " Has been saved! :D");
                    System.out.println("If you would like to \n" +
                            " 1. Exit to main menu \n" +
                            " 2. Save new game");
                    if (input.nextInt() == 1) {
                        interaction();
                    } else {
                        System.out.println("Please input your second game!");
                        input.nextLine();
                        gameString.add(input.nextLine());

//                        setGameSaved2(input.nextLine());
                    }

                    System.out.println("Press 3 to exit");
                    if (input.nextInt() == 3) {
                        interaction();
                    }

                    break;
                case 2:

                    /** Takes the games the user added from case 1 and allows you to remove them.
                     *  Takes you back to method interaction.
                     */
                    System.out.println("Which game would you like to remove? \n 1. " + gameString.get(0));
                    System.out.println(" 2. " + gameString.get(1));
                    input.nextLine();
                    int userInput3 = input.nextInt();
                    if (userInput3 == 1) {

                        gameString.remove(0);
                        System.out.println("You have removed " + gameString.get(0) + " From your game library");

                        interaction();
                        break;
//                    } else if (input.nextInt() == 2) {
//                        System.out.println("You have removed " + gameString.get(1));
                    } else if (userInput3 == 2) {
                        gameString.remove(1);
                        System.out.println("Game has been removed");
                        interaction();
                    }

                case 3:

                    /** case 3, Method (Interaction) in SelectionOptions that takes input from user, allows checkout and
                     *  gives due dates for all the games the user wants and sets it so the code can get it back from the user.
                     */
                    System.out.println("Which game would you like to check out? \n 1. Fallout Series \n 2. Terraria \n 3. World of Warcraft \n 4. Skyrim");

                    //Create variable to hold user input for which game they want to check out
                    //Pass this variable into the if statement
                    int userInput = input.nextInt();
                        if (userInput == 1) {
                            System.out.println("These are the list of Fallout games avaliable \n 1. Fallout \n 2. Fallout 2 \n 3. Fallout 3 \n 4. Fallout New Vegas \n 5. Fallout 4");
                            switch (input.nextInt()) {
                                case 1:
                                    /** Fallout Section */
                                    calendar.add(Calendar.DAY_OF_YEAR, 10);
                                    setCheckedOut("Fallout");
//                                    checkedOut.checkOutDatesMethod();

                                    System.out.println("Fallout has been added to checked out games! \n this game will be due: " + checkOutDate.format(calendar.getTime()));
                                    interaction();

//                                    System.out.println(checkOutDate.format(calendar.getTime()));
                                    break;
                                case 2:
                                    /** Fallout 2 Section */
                                    setCheckedOut("Fallout 2");
                                    calendar.add(Calendar.DAY_OF_YEAR, 10);
                                    System.out.println("Fallout 2 has been added to your checked out games! \n It will be due: " + checkOutDate.format(calendar.getTime()));
                                    interaction();
                                    break;
                                case 3:
                                    /** Fallout 3 Section */
                                    setCheckedOut("Fallout 3");
                                    calendar.add(Calendar.DAY_OF_YEAR, 10);
                                    System.out.println("Fallout 3 has been added to your checked out list \n It will be due: " + checkOutDate.format(calendar.getTime()));
                                    interaction();
                                    break;
                                case 4:
                                    /** Fallout New Vegas Section */
                                    setCheckedOut("Fallout New Vegas");
                                    calendar.add(Calendar.DAY_OF_YEAR, 8);
                                    System.out.println("You have added Fallout New Vegas to your checked out list! " + checkOutDate.format(calendar.getTime()));
                                    interaction();
                                    break;

                            }

                        }

                        /** The other options besides the fallout series */
//                        int userInput2 = input.nextInt();
                        if (userInput == 2) {
                        setCheckedOut("Terraria");
                        calendar.add(Calendar.DAY_OF_YEAR, 7);
                        System.out.println("You have checked out Terraria \n It will be due " + checkOutDate.format(calendar.getTime()));
                        interaction();

                        } else if (userInput == 3) {
                            setCheckedOut("World of Warcraft");
                            calendar.add(Calendar.DAY_OF_YEAR, 15);
                            System.out.println("You have checked out World of Warcraft \n It will be due: " + checkOutDate.format(calendar.getTime()));
                            interaction();
                        } else if (userInput == 4) {
                            setCheckedOut("Skyrim");
                            calendar.add(Calendar.DAY_OF_YEAR, 12);
                            System.out.println("You have checked out Skyrim \n It will be due " + checkOutDate.format(calendar.getTime()));
                            interaction();

                        }
                        System.out.println("Press 8 to leave");
                        if (userInput == 8) {
                            interaction();
                        }
                        break;

                case 4:
                    /** Lists games the user stated in case 1 and asks if user would
                     *  like to go back to method (interaction) */
                    System.out.println("These are your currently added games \n" +
                            " 1. " + gameString.get(0) + " \n" +
                            " 2. " + gameString.get(1));
                    //Do foreach loop to iterate through what games are in the list.  

                    System.out.println("Press 3 if you would like to exit to the menu");
                        if (input.nextInt() == 3) {
                            interaction();
                        }
                    break;

                case 5:
                    /** Shows the user what game they have checked out and allows
                     *  the user to press 1 and it makes the value of the checked
                     *  Out game null (Check in), also allows them to go back to Method (interaction)
                     */
                    System.out.println("Which one of the games would you like to check in? \n 1. " + getCheckedOut());
                    if (input.nextInt() == 1) {
                        setCheckedOut(null);
                        System.out.println("You have checked in your game");

                    }
                    System.out.println("Press 3 to return to menu");
                    if (input.nextInt() == 3) {
                        interaction();
                    }
                    break;


                case 6:
                    /** Allows user to view checked out games without the check in function in
                     *  case 5, also allows user to go back to method (Interaction)
                     */
                    System.out.println("These are your list of checked out games \n 1. " + getCheckedOut());
                    System.out.println("Press 3 to exit");
                    if (input.nextInt() == 3) {
                        interaction();

                    }
                    break;

                case 7:
                    /** Edits/ends the program */

                    System.exit(0);


                    }














            } catch (IndexOutOfBoundsException ime) {
            /** If a person tries to access the library without a game it will
             *  catch this error and display a message letting them know they need a game to view
             */
            System.out.println("Error, not recognized \n You have to have a game to view your library!");
            interaction();


        }
        }





    }







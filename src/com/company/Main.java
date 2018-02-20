package com.company;

import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {


    /**It's good practice not to instantiate objects automatically at the top of classes. This way you get to control when objects are instantiated through code.
     * This will keep you from accidentally using objects before they're instnatiated, leading to a crash. */
    Main main = new Main();








    public static void main(String[] args) {

        /**Some functionality issues, but the crux of the app is there. I'd go back and read more on arraylists and constructors, but otherwise, good job! */


        SelectionOptions options = new SelectionOptions();
        CheckOutDates checkOut = new CheckOutDates();

        checkOut.checkOutDatesMethod();
        options.interaction();







    }







}

package com.saumil.util;

import java.util.Scanner;

public class IO {
    private static Scanner mainScanner = new Scanner(System.in);

    public static String prompt(String prompt){
        System.out.println(prompt);
        return mainScanner.next();
    }

    public static String promptOption(){
        System.out.println("Please enter an option:\n[A]dd a Node\n[R]emove a Node\n[V]iew the Tree\n[B]alance the Tree");
        return mainScanner.next();
    }

    public static void logError(String message){
        System.out.println("[ERROR]: " + message);
    }

    public static void logError(Exception exception){
        System.out.println("[ERROR]" + exception.getLocalizedMessage());
    }
}

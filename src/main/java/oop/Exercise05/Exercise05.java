package oop.Exercise05;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise05
{
    static Scanner input = new Scanner(System.in);
    public static String FirstNumber() {
        System.out.print("What is the first number? ");
        return input.nextLine();
    }
    public static String SecondNumber() {
        System.out.print("What is the second number? ");
        return input.nextLine();
    }
    public static void math(int frst, int scnd) {
        int add = frst + scnd;
        int sub = frst - scnd;
        int mult = frst *  scnd;
        int div = frst / scnd;

        System.out.print(frst + " + " + scnd + " = " + add + "\n" +
                frst + " - " + scnd + " = " + sub + "\n" +
                frst + " * " + scnd + " = " + mult + "\n" +
                frst + " / " + scnd + " = " + div);
    }
    public static void main( String[] args ) {
        String FirstNumber = FirstNumber();
        String SecondNumber = SecondNumber();

        int frst = Integer.parseInt(FirstNumber);
        int scnd = Integer.parseInt(SecondNumber);

        math(frst, scnd);

    }
}

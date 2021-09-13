/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kamila Hollerbach
 */

package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = s.nextInt();

        if (age < 0)
            System.out.println("Enter a valid age");
        else {
            String country[] = {"Algeria", "Canada", "Africa", "Mexico", "Iran"};
            int valid_age[] = {18, 16, 17, 15, 18};

            for (int i = 0; i < 5; i++)
                System.out.println(age >= valid_age[i] ? "You are old enough to legally drive in " + country[i] : "You are not old enough to legally drive " + country[i]);
        }
    }
}



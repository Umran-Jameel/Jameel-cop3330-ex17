/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise17 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your weight? ");
        double weight = in.nextDouble();

        System.out.print("What is your gender? Type 1 for male or 2 for female.");
        int gender = in.nextInt();
        double ratio;
        if (gender == 1)
        {
            ratio = 0.73;
        }
        else
        {
            ratio = 0.66;
        }

        System.out.print("How much alcohol (in ounces) did you consume? ");
        double oz = in.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        double hours = in.nextDouble();

        double BAC = ((oz * 5.14) / (ratio * weight)) - ((0.015) * hours);

        System.out.printf("Your BAC is %.2f\n", BAC);
        String out = (BAC > 0.07) ? "It is not legal for you to drive." : "It is legal for you to drive.";
        System.out.println(out);


    }
}

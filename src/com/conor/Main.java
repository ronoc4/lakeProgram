/*
Conor Budge
Assignment 4
2/29/16
 */

package com.conor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create array list to store values
        ArrayList<Double> lakes = new ArrayList<Double>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your times around a lake, when done click ENTER");
            String lake = scanner.nextLine();

            //Keep looping until user does not enter a value
            if(lake.length() ==0) {
                break;
            }
            lakes.add(Double.parseDouble(lake)); //add to array list
        }

        //Create max/ min variables and initialize to 0
        double min = lakes.get(0);
        double max = lakes.get(0);

        //Foreach loop to get max and min
        for (Double times: lakes) {
            if (times > max) {
                max = times;
            }
            if (times < min) {
                min = times;
            }
        }


        System.out.println("Here are your times around each lake: " + lakes);
        System.out.println("The fastest time you ran was " + max);
        System.out.println("The slowest time was " + min);

    }
}

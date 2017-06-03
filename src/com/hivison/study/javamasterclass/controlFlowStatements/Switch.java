package com.hivison.study.javamasterclass.controlFlowStatements;
/**
 * Created by Hivison N Moura on 03/06/2017.
 */
public class Switch {
    public static void main(String[] args) {
        /*
         *Create a new switch statement using char instead of int
         * Create a new char variable
         * Create a switch statement testing for
         * A, B, C, D, or E
         * display a message if any of these are found and then break
         * Ad a default which displays a message saying not found
         */

        char switchCharValue = 'Z';
        switch (switchCharValue){
            case 'A':
                System.out.println("A was found!");
                break;
            case 'B':
                System.out.println("B was found!");
                break;
            case 'C':
                System.out.println("C was found!");
                break;
            case 'D':
                System.out.println("D was found!");
                break;
            case 'E':
                System.out.println("E was found!");
                break;
            default:
                System.out.printf("Cold not found %s statement!%n", switchCharValue);
                break;

        }
    }
}

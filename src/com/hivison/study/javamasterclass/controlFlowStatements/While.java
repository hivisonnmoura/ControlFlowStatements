package com.hivison.study.javamasterclass.controlFlowStatements;

/**
 * Created by hnascimento on 03/06/2017.
 */
public class While {

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;
        }
        System.out.println("############################################");
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        int numbers =5;
        int finishNumbers = 20;
        int evenNumberFound=0;
        while(numbers <= finishNumbers){
            if(!isEvenNumber(numbers)){
                numbers++;
                continue;
            }
            if(evenNumberFound >= 5)
                break;

            evenNumberFound++;
            System.out.println("Even number " + numbers);
            numbers++;
        }
        System.out.println("Total number found " + evenNumberFound);
    }


    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}

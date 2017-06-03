package com.hivison.study.javamasterclass.controlFlowStatements;
/**
 * Created by hnascimento on 03/06/2017.
 */
public class ForLoop {

/*
*Using the for statement, call the calculateInterest method with
* the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
* and print the results to the console
*/
    public static void main(String[] args) {
        double amount = 10000.0;
        for (int i = 2; i <=8; i++){
            System.out.println(calculateInterest(amount,i));
        }
        /*
        *How would you modify the loop for aobve to do the same thing as
        * shown but start from 8% and work back to 2%
        */
        System.out.println("----------------------------------------");
        for (int i = 8; i >=2; i--){
            System.out.println(calculateInterest(amount,i));
        }
         /*
    *Create a for statement using any range of number
    *Determine if the number is a prime number using the is Prime method
    *If it is a prime number, print it out AND increment a count of the
    * number of prime numbers found
    * If that count is 3 exit the for loop
    * hint: Use break; statement to exit
     */
        System.out.println("##########################################");
        int primeAmount = 0;
        for(int i = 1 ; i <= 10; i++){
            if(primeAmount ==3){
                break;
            }

            if(isPrime(i)){
                ++primeAmount;
                System.out.println("Prime number: " + i);
            }


        }

    }





    public static boolean isPrime(int n){
        if(n==1)
            return false;

        for (int i = 2; i <= (long) Math.sqrt(n); i++ ){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}

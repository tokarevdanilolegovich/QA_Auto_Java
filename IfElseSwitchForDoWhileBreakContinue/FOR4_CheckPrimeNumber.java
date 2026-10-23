package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class FOR4_CheckPrimeNumber {
    public static void main(String[] args){
        checkPrimeNumber();
    }
    public static void checkPrimeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if(number <=1){
            isPrime = false;
            System.out.println("Число простое? - " + isPrime);

        }
        else{
            for(int i = 2; i < number;i++){
                if(number % i == 0 ){
                    isPrime = false;
                }
            }
            System.out.println("Число простое? - " + isPrime);
        }

    }

}

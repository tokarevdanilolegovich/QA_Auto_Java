package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class FindMaxDigits_Task2 {
    public static void main(String[] args){
        findMaxDigits();
    }

    public static void findMaxDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 =  scanner.nextInt();
        int maxDigit = number1;
        if(number2 > maxDigit){
            maxDigit = number2;
        }


        System.out.println("Максимальное число: " +  maxDigit);

    }
}

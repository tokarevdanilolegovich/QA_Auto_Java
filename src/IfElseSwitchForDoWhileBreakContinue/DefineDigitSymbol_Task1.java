package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class DefineDigitSymbol_Task1 {
    public static void main(String[] args){
        DefineDigitSymbol_Task1.defineDigitSymbol();
    }

    public static void defineDigitSymbol(){
        int digit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        digit = scanner.nextInt();
        if(digit > 0){
            System.out.println("Число положительное");
        }
        else if(digit < 0){
            System.out.println("Число отрицательное");
        }
        else{
            System.out.println("Число равно нулю");
        }
    }
}

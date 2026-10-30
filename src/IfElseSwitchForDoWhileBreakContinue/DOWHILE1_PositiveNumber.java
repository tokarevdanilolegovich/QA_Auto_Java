package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class DOWHILE1_PositiveNumber {
    public static void main(String[] args){
        positiveNumber();
    }
    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.print("Введите число: ");
              number = scanner.nextInt();
        }while( number <= 0);
        System.out.println("Вы ввели положительное число!");
    }
}

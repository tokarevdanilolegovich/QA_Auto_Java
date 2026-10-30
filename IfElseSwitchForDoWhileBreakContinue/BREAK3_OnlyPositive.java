package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class BREAK3_OnlyPositive {
    public static void main(String[] args){
        onlyPositive();
    }
    public static void onlyPositive(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int counter = 0;
        do{
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            counter++;
            if(number <= 0){
                continue;
            }
            System.out.println("Вы ввели положительное число: " + number);

        } while (counter < 10);//придумал условие сам,так как в задаче не было
    }
}

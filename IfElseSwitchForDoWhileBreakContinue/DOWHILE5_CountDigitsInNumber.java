package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class DOWHILE5_CountDigitsInNumber {
    public static void main(String[] args){
        countDigits();
    }
    public static void countDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int digitscount = 0;
        do{
            number = number / 10;
            digitscount++;
        }while(number > 0);
        System.out.println("Количество цифр в числе: " + digitscount);
    }
}

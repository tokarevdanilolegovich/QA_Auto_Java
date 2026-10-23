package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class WHILE3_ReversalCounting {
    public static void main(String[] args){
        reversalCount();
    }
    public static void reversalCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;
        while(number >= i){
            System.out.println(number);
            number--;
        }
    }
}

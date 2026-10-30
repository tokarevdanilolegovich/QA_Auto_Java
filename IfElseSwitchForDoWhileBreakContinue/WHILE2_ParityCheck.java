package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class WHILE2_ParityCheck {
    public static void main(String[] args){
        parityCheck();
    }
    public static void parityCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;
        while(i <= number){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}

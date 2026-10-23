package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class WHILE1_Factorial {
    public static void main(String[] args){
        factorial();
    }
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;
        int result = 1;
        while(i <= number){
            result = result * i;
            i++;
        }
        System.out.println(result);
    }
}
//6
//1*2*3*4*5*6

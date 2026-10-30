package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class CheckParity_Task4 {
    public static void main(String[] args){
        checkParity();
    }
    public static void checkParity(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        String result = "нечетное";

        if(number % 2 == 0){
            result = "четное";
        }
        System.out.println("Число " + result);

    }
}

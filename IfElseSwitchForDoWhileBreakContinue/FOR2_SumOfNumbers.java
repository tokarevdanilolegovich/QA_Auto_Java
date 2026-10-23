package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class FOR2_SumOfNumbers {
    public static void main(String[] args){
        sumOfNumbers();
    }
    public static void sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputtednumber = scanner.nextInt();
        int result = 0;
        for(int i = 1; i <= inputtednumber; i++){
            result = result + i;
        }
        System.out.println("Cумма всех чисел от 1 до " + inputtednumber + " это " + result);
    }
}

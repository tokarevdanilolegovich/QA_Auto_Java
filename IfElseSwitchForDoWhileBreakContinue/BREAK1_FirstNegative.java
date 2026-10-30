package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class BREAK1_FirstNegative {
    public static void main(String[] args){
        firstNegative();
    }
    public static void firstNegative(){
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        while(true){
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if(number < 0){
                break;
            }
            sum = sum + number;
        }
        System.out.println("Сумма чисел до первого отрицательного: " + sum);
    }
}

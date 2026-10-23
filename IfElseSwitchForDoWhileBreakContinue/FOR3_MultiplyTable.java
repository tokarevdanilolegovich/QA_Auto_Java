package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class FOR3_MultiplyTable {
    public static void main(String[] args){
        mTable();
    }
    public static void mTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for(int i = 1; i <=10;i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}

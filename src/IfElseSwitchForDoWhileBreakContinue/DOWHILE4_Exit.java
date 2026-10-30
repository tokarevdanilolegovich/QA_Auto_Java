package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class DOWHILE4_Exit {
    public static void main(String[] args){
        exit();
    }
    public static void exit(){
        Scanner scanner = new Scanner(System.in);
        String command;
        String rightcommand = "exit";
        do{
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }while(!command.equals(rightcommand));
        System.out.println("Вы ввели exit");
    }
}

package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class BREAK4_UntilStop {
    public static void main(String[] args){
        untilStop();
    }
    public static void untilStop(){
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while(true){
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
        }
        System.out.println("Вы ввели stop");
    }
}

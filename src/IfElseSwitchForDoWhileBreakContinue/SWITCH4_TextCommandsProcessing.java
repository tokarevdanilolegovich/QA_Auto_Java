package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class SWITCH4_TextCommandsProcessing {
    public static void main(String[] args){
        commandProcessing();
    }
    public static void commandProcessing(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String textcommand = scanner.nextLine();
        String systemmessage;
        switch(textcommand){
            case "start":
                systemmessage = "Система запущена";
                break;
            case "stop":
                systemmessage = "Система остановлена";
                break;
            case "restart":
                systemmessage = "Система перезапущена";
                break;
            case "status":
                systemmessage = "Система активна";
                break;
            default:
                systemmessage = "Невалидная команда";
                break;
        }
        System.out.println(systemmessage);
    }
}
package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class SWITCH1_DayofWeek {
    public static void main(String[] args){
        dayOfWeek();
    }
    public static void dayOfWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int digitalday = scanner.nextInt();
        String stringday;
        switch (digitalday){
            case 1:
                stringday = "Понедельник";
                break;
            case 2:
                stringday = "Вторник";
                break;
            case 3:
                stringday = "Среда";
                break;
            case 4:
                stringday = "Четверг";
                break;
            case 5:
                stringday = "Пятница";
                break;
            case 6:
                stringday = "Суббота";
                break;
            case 7:
                stringday = "Воскресенье";
                break;
            default:
                stringday = "Некорректный ввод";
                break;
        }
        System.out.println(stringday);
    }
}

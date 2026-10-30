package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class PrintGrade_Task3_1onemoretime {
    public static void main(String[] args){
        printGrade();
    }
    public static void printGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int intGrade = scanner.nextInt();
        String textGrade;
        switch(intGrade) {
            case (5):
                textGrade = "Отлично";
                break;
            case (4):
                textGrade = "Хорошо";
                break;
            case (3):
                textGrade = "Удовлетворительно";
                break;
            case 2,1:
                textGrade = "Неудовлетворительно";
                break;

            default:
                textGrade = "Невалидная оценка";
                break;

        }
        System.out.println("Текстовая оценка: " + textGrade);
    }
}

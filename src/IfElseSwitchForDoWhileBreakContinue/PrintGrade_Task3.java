package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class PrintGrade_Task3 {
    public static void main(String[] args){
        printGrade();
    }
    public static void printGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();
        String textDescription = "";
        switch(grade){
            case(5):
                textDescription = "Отлично";
                break;
            case(4):
                textDescription = "Хорошо";
                break;
            case(3):
                textDescription = "Удовлетворительно";
                break;
            case(2):
                textDescription = "Неудовлетворительно";
                break;
            case(1):
                textDescription = "Неудовлетворительно";
                break;
            default:
                textDescription = "Невалидная оценка";
                break;


        }


        System.out.println("Оценка: " + textDescription);

        }
    }


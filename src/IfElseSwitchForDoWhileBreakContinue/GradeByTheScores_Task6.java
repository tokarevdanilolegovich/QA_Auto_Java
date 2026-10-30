package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class GradeByTheScores_Task6 {
    public static void main(String[] args){

        defineGradeByScore();
    }
    public static void defineGradeByScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите результат теста от 0 до 100: ");
        int score = scanner.nextInt();
        String grade;
        if(score < 0 || score > 100){
            grade = "Невалидный ввод";
        }
        else if(score >= 90){
            grade = "Отлично";
        }
        else if(score >= 75 && score <= 89){
            grade = "Хорошо";
        }
        else if(score >= 60 && score <= 74){
            grade = "Удовлетворительно";
        }
        else{
            grade = "Неудовлетворительно";
        }
        System.out.println("Оценка результата теста по баллам: " + grade);

    }
}

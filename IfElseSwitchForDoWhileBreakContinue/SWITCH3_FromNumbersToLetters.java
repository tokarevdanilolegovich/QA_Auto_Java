package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class SWITCH3_FromNumbersToLetters {
    public static void main(String[] args){
        convertNumbersToLetters();
    }
    public static void convertNumbersToLetters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  число от 0 до 100: ");
        int gradeinnumber = scanner.nextInt();
        String gradeinletters="";
        if(gradeinnumber < 0 || gradeinnumber > 100){
            gradeinletters = "Невалидный ввод";
        }
        else if(gradeinnumber < 60 ){
            gradeinletters = "F";
        }
        else if(gradeinnumber<= 69 ){
            gradeinletters = "D";
        }
        else if(gradeinnumber <= 79){
            gradeinletters = "C";
        }
        else if(gradeinnumber <= 89){
            gradeinletters = "B";
        }
       
        else gradeinletters = "Невалидный ввод";
        System.out.println("Ваша оценка: " + gradeinletters);
    }

}

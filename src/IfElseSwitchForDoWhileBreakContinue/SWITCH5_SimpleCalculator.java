package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class SWITCH5_SimpleCalculator {
    public static void main(String[] args){
        calculator();
    }
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstnumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondnumber = scanner.nextInt();
        System.out.print("Введите оператор: ");
        String operator = scanner.next();
        double result = 0;
        switch(operator){
            case "+":
                result = firstnumber + secondnumber;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = firstnumber - secondnumber;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = firstnumber * secondnumber;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if(secondnumber == 0){
                    System.out.println("На 0 делить нельзя!");
                    break;
                }
                else result = (double) firstnumber / secondnumber;
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Невалидный ввод");
                break;

        }

    }
}

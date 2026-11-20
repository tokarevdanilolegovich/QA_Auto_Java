package Exceptions_and_Generics.Exceptions;

import java.util.*;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое: ");
        int dividend = scanner.nextInt();
        System.out.println("Введите делитель: ");
        int divisor = scanner.nextInt();
        try{
            // целочисленное деление: если divisor == 0, JVM бросит ArithmeticException
            System.out.println("Результат деления (он же частное,он же quotient): " + dividend / divisor);
        }catch(ArithmeticException e){
            // это UNCHECKED-исключение: ловить его компилятор НЕ заставляет,
            // мы перехватываем добровольно, чтобы программа не упала на /0
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

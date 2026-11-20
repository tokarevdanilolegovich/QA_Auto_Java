package Exceptions_and_Generics.Exceptions.Task3;

import java.util.*;

public class Task3 {
    // throws в сигнатуре — часть контракта checked-исключения: «метод может
    // выбросить UserAgeException, вызывающий обязан это обработать»
    static void validateAge(int age) throws UserAgeException{
        if(age < 0 || age > 150){
            // throw (без s!) — сам момент выброса: создаём конверт и выстреливаем им,
            // выполнение метода прерывается мгновенно и управление прыгает в catch
            throw new UserAgeException("Некорректный возраст: " + age);
        }
        System.out.println("Возраст " + age + " валиден.");
    }

    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите возраст: ");
            int age = scanner.nextInt();
            validateAge(age);
        }catch(UserAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

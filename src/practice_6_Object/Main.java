package practice_6_Object;

import java.util.*;

public class Main {
    public static void main(String[]args){
        Person nikita = new Person("Никита",25);

        //toString() по умолчанию из класса Object
        System.out.println(nikita.toString());
        System.out.println(nikita);

        //Сравнение двух объектов(примитивные типы данных сравниваются через ==)
        //Ссылочные сравниваются через equals()
        Person nikita2 = new Person("Никита", 25);

        System.out.println(nikita == nikita2); //FALSE - два разных объекта, с двумя разными адресами в памяти
        System.out.println(nikita.equals(nikita2)); // FALSE,после переопределения True - в Оbject equals() сравнивает тоже адреса в памяти

        //Клонирование
        Person cloneNikita = nikita.clone();
        System.out.println(cloneNikita);


        System.out.println(nikita.getClass());

    }
}

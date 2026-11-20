package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Storage<Integer> storage1 = new Storage<>();
        Storage<String> storage2 = new Storage<>();

        storage1.setItem(1);
        storage2.setItem("One");

        System.out.println(storage1.getItem());
        System.out.println(storage2.getItem());
    }
}

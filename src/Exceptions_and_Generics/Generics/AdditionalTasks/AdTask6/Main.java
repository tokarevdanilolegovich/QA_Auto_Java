package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask6;

import java.util.*;

public class Main {
    public static void main(String[] args){
        SlotContainer<Integer> cont1 = new SlotContainer<>();
        SlotContainer<String> cont2 = new SlotContainer<>();

        cont1.add(1);
        cont2.add("One");

        System.out.println(cont1.get());
        System.out.println(cont2.get());
    }
}

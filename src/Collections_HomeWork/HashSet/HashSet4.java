package Collections_HomeWork.HashSet;

import java.util.*;

public class HashSet4 {
    public static void main(String[] args){
        Set<String> names = new HashSet<>(Set.of("Danil", "Alex", "Alexandr", "Edward", "Stas"));
        //System.out.println(names);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        if(names.contains(name)){
            System.out.println("Ваше имя содержится в множестве!");
        }
        else{
            System.out.println("Ваше имя не содержится в множестве!");
        }
    }
}

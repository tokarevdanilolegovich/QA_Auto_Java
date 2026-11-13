package Collections_HomeWork.HashMap;

import java.util.*;

public class HashMap2 {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Мария", 27);
        map.put("Игорь", 29);
        map.put("Аркадий", 35);
        map.put("Борис", 44);
        map.put("Сергей", 40);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для проверки: ");
        String nameforcheck = scanner.nextLine();

        if(map.containsKey(nameforcheck)){
            System.out.println("Имя найдено");
        }
        else{
            System.out.println("Имя не найдено");
        }
    }
}

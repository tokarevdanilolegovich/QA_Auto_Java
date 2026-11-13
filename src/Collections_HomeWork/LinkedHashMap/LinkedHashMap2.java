package Collections_HomeWork.LinkedHashMap;

import java.util.*;

public class LinkedHashMap2 {
    static void main(String[] args){
        Map<String, String> contacts = new LinkedHashMap<>();
        contacts.put("Андрей", "+7905888");
        contacts.put("Алина", "+7905889");
        contacts.put("Артём", "+7905890");
        contacts.put("Борис", "+7905891");
        contacts.put("Глеб", "+7905892");
        contacts.put("Влад", "+7905893");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для поиска в телефонной книге: ");
        String search = scanner.nextLine();
        if(contacts.containsKey(search)){
            System.out.println("Номер телефона: " + contacts.get(search));
        }
        else{
            System.out.println("Контакт не найден");
        }
    }
}

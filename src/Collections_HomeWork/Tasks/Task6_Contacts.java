package Collections_HomeWork.Tasks;

import java.util.*;

public class Task6_Contacts {
    public static void main(String[] args){
        HashMap<String, String> contacts = new HashMap<>();
        for(int i = 1; i < 11;i++){
            contacts.put("Contact " + i,"+66334"+i);
        }
        for(Map.Entry<String,String> entry : contacts.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый контакт: ");
        String search = scanner.nextLine();
        if(contacts.containsKey(search)){
            System.out.println("Контакт " + search + " найден.");
        }
        else{
            System.out.println("Контакт " + search + " не найден.");
        }

    }
}

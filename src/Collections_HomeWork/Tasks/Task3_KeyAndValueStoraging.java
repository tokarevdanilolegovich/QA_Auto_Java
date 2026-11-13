package Collections_HomeWork.Tasks;

import java.util.*;

public class Task3_KeyAndValueStoraging {
    public static void main(String[] args){
        HashMap<String,String> storage = new HashMap<>();
        for(int i = 1; i < 11; i++){
            storage.put("Parameter " + i, " Value " + i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый параметр: ");
        String parameter = scanner.nextLine();
        if(storage.containsKey(parameter)){
            System.out.println("Параметр " + parameter + " " + "есть в базе");
        }
        else{
            System.out.println("Параметр " + parameter + " " + "не обнаружен в базе");
        }
        for(Map.Entry<String,String> entry : storage.entrySet() ){
            System.out.println("Ключ: "+ entry.getKey()  + ", Значение: " + entry.getValue());
        }

    }
}

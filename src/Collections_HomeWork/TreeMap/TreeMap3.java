package Collections_HomeWork.TreeMap;

import java.util.*;

public class TreeMap3 {
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100,"Danil");
        map.put(200,"Alla");
        map.put(300,"Mathew");
        map.put(400,"Alex");
        map.put(500,"Anna");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID: ");
        int search = scanner.nextInt();
        if(map.higherKey(search) == null){
            System.out.println("Более высокого ID нет.");
        }
        else{
            System.out.println("Ближайший больший ID: " + map.higherKey(search));
        }
    }
}

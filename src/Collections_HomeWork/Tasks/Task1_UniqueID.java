package Collections_HomeWork.Tasks;

import java.util.*;

public class Task1_UniqueID {
    public static void main(String[] args){
        Set<Integer> users = new HashSet<>();
        for(int i = 0; i< 1500; i++){
            users.add(i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое ID: ");
        int userID = scanner.nextInt();
        if(users.contains(userID)){
            System.out.println("Пользователь с таким ID найден");
        }
        else{
            System.out.println("Пользователя с таким ID не найдено");
        }
    }
}

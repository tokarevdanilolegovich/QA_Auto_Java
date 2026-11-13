package Collections_HomeWork.TreeSet;

import java.util.*;

public class TreeSet3 {
    public static void main(String[] args){
        TreeSet<Integer> numbers = new TreeSet<>();
        for(int i = 0; i < 10 ; i++){
            numbers.add(i * 2);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        System.out.println("Наименьшее ближайшее число к заданному: " + numbers.lower(input));
        System.out.println("Наибольшее ближайшее число к заданному: " + numbers.higher(input));

    }
}

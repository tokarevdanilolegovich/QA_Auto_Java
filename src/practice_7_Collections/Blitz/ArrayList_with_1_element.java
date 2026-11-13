package practice_7_Collections.Blitz;

import java.util.ArrayList;

public class ArrayList_with_1_element {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(); //array на 10 элементов
        list.add("A");
        System.out.println(list.size()); // 1 размер,потому что в массиве только один элемент
    }
}

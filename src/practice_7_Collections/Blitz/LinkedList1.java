package practice_7_Collections.Blitz;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.add("E" + i);
        }
        System.out.println(list.get(0)); // получаем значение элемента по индеку 0 -> E0
        System.out.println(list.get(list.size() - 2));//получаем значение элемента по индексу 8 -> E8
    }
}

package Collections_HomeWork.ArrayList;

import java.util.*;

public class ArrayList3 {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        String current = "";
        for(int i = 0; i < 10; i++){
            current = current + "a";
            strings.add(current);
            System.out.println(strings);
        }
        String longest = "";
        for (String e : strings){
            if(e.length() > longest.length()){
                longest = e;
            }
        }
        System.out.println("Самая длинная строка: " + longest);

    }
}

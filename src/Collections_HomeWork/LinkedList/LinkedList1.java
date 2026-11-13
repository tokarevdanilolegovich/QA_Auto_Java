package Collections_HomeWork.LinkedList;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args){
        List<String> strings = new LinkedList<>();
        String container = "";
        for(int i = 0; i < 5; i++){

            container+="String";
            strings.add(container);
            //System.out.println(strings);
        }
        for(String e : strings){
            System.out.println(e);
        }
    }
}

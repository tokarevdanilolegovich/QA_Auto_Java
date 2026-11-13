package practice_7_Collections.LinkedHashSet_HashMap_TreeMap;
import java.util.*;
public class ArrayList_ListOf {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(List.of("A","B","C"));
        for (String s : list){
            if(s.equals("B")){
                list.remove(s); //до JAVA 21 здесь было бы исключение потому что надо проходить через итератор
            }
        }
        System.out.println(list);
    }
}

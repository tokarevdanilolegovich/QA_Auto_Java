package practice_7_Collections.LinkedHashSet_HashMap_TreeMap.Person_TreeSet;
import java.util.*;
public class Person {
    String name;

    Person(String name){
        this.name = name;
    }
    @Override // это маркер,даже если это слово не прописать, переопределение всё равно будет
    public String toString(){
        return name;
    }
}

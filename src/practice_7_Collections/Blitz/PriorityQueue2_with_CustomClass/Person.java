package practice_7_Collections.Blitz.PriorityQueue2_with_CustomClass;

public class Person implements Comparable<Person>{
    String name;
    Person(String name){
        this.name = name;
    }
    @Override
    public int compareTo(Person o){
        return 0;
    }
}

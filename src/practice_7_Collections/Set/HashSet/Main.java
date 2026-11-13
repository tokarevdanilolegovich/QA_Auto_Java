package practice_7_Collections.Set.HashSet;

import java.util.*;

public class Main {
    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }

        @Override
        public boolean equals(Object o){
            if(this == o){
                return true;
            }
            if(o == null || getClass()!= o.getClass()){
                return false;
            }
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }
    }
    public static void main(String[]args){
        Set<Person> set = new HashSet<>();
        set.add(new Person("Alice"));
        set.add(new Person("Alice"));

        System.out.println(set.size());
    }
}

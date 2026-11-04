package Collections.Set.User2_with_TreeSet;

public class User implements Comparable<User>{
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User other){
        int result = name.compareTo(other.name);

        if (result!= 0){
            return result;
        }

        return Integer.compare(age, other.age);
    }

    @Override
    public String toString(){
        return name + " " + age;
    }
}

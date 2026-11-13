package Collections.Map.CorrectUser_with_HashMap;
import java.util.*;
public class User {
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof User)){
            return false;
        }
        User other = (User) o; // можем спокойно прикастовывать объект o к классу User, не боясь упасть с ошибкой,
        //так как выше уже убедились в блоке if ,что o является объектом User
        //мы должны сделать кастование так как у объекта o типа данных Object нет полей name и age с которыми мы дальше будем сравнивать

        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}

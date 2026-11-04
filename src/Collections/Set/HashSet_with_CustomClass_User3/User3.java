package Collections.Set.HashSet_with_CustomClass_User3;
import java.util.*;

public class User3 {
    String name;

    User3(String name){
        this.name = name;
    }

    @Override
    public int hashCode(){
        return 1;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof User3)){
            return false;
        }
        User3 other = (User3) o;
        return Objects.equals(name, other.name);
    }
}

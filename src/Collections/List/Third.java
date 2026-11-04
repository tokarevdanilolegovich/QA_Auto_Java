package Collections.List;
import java.util.*;
public class Third {
    public static void main(String[] args){
        List<String> cities = new ArrayList<>();

        cities.add("Aruba");
        cities.add("Amsterdam");
        cities.add("Paris");

        Iterator<String> it = cities.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(it.hasNext());
    }
}

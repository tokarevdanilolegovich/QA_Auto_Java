package practice_7_Collections.Blitz;
import java.util.*;
public class HashSet_and_LinkedHashSet {
    public static void main(String[] args){
        HashSet<Integer> hset = new HashSet<>();
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>();

        for ( int i : new int[]{3, 1, 2}){
            hset.add(i);
            lhset.add(i);
        }
        System.out.println(hset);
        System.out.println(lhset);
    }
}

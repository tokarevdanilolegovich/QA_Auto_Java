package Collections.List;
import java.util.*;
public class Fourth {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);

        System.out.println(nums);

        nums = new LinkedList<>();
        nums.add(30);
        nums.add(40);

        System.out.println(nums);


    }
}

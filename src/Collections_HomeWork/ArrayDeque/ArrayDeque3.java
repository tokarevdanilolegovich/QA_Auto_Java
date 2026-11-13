package Collections_HomeWork.ArrayDeque;

import java.util.*;

public class ArrayDeque3 {
    public static void main(String[] args){
        ArrayDeque<String> strings = new ArrayDeque<>();
        strings.addFirst("First-first");
        strings.addLast("First-last");
        strings.addFirst("Second-first");
        strings.addLast("Second-last");
        strings.addFirst("Third-first");
        strings.addLast("Third-last");
        System.out.println(strings);
        System.out.println();

        System.out.println(strings.removeFirst());
        System.out.println(strings);
        System.out.println();


        System.out.println(strings.removeLast());
        System.out.println(strings);
        System.out.println();

        System.out.println(strings.removeFirst());
        System.out.println(strings);
        System.out.println();

        System.out.println(strings.removeLast());
        System.out.println(strings);
        System.out.println();

        System.out.println(strings.removeFirst());
        System.out.println(strings);
        System.out.println();

        System.out.println(strings.removeLast());
        System.out.println(strings);
        System.out.println();



    }
}

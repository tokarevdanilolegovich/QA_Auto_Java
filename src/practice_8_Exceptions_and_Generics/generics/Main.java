package practice_8_Exceptions_and_Generics.generics;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Box<String> boxString = new Box<>();
        boxString.setElement("Element");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(3);

        Box<Book> boxWithBooks = new Box<>();
        boxWithBooks.setElement(new Book("Book"));
    }
}

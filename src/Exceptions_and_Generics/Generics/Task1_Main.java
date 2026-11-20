package Exceptions_and_Generics.Generics;

import java.util.*;

public class Task1_Main {
    public static void main(String[] args){
        Task1_Box<String> box1 = new Task1_Box<>();
        box1.set("box1");
        System.out.println(box1.get());
    }
}

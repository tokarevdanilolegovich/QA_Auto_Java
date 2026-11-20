package practice_8_Exceptions_and_Generics.errors;

import java.util.*;

public class StackOverflowError_Example {
    public static void main(String[] args){
        recursivePrint(1);
    }
    public static void recursivePrint(int num){
        System.out.println(num);
        recursivePrint(num+1);
    }
}

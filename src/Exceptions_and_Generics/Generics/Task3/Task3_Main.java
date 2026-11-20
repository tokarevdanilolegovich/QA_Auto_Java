package Exceptions_and_Generics.Generics.Task3;

public class Task3_Main {
    public static void main(String[] args){
        Task3_Pair<String, Integer> object = new Task3_Pair<>();
        object.setFirst("FIRST");
        object.setSecond(2);
        System.out.println(object.getFirst());
        System.out.println(object.getSecond());
    }
}

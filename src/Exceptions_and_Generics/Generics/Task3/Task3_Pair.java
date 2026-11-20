package Exceptions_and_Generics.Generics.Task3;

// два типа-параметра: T отвечает за first, U — за second.
// При создании Pair<String, Integer> getFirst() вернёт String, getSecond() — Integer
public class Task3_Pair <T,U>{
    private T first;
    private U second;

    public T getFirst(){
        return this.first;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public U getSecond(){
        return this.second;
    }
    public void setSecond(U second){
        this.second = second;
    }
}

package Exceptions_and_Generics.Generics;

import java.util.*;

// <T> — тип-параметр класса: он не существует сам по себе, а фиксируется
// при создании объекта: new Task1_Box<String>() → внутри T становится String
public class Task1_Box <T> {
    private T item;



    public void set(T item){
        this.item = item;
    }
    public T get(){
        return this.item;
    }
}

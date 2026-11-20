package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask1;

import java.util.*;

public class Storage <T>{
    private T item;

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}

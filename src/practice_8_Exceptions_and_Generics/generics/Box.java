package practice_8_Exceptions_and_Generics.generics;

import java.util.*;

public class Box <T>{
    private T element;

    public void setElement(T element){
        this.element = element;

    }

    public T getElement(){
        return this.element;
    }
}

package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask3;

import java.util.*;

// <T extends Number> — ОГРАНИЧЕННЫЙ тип: T может быть только Number или его потомком
// (Integer, Double, Float...). String сюда не пройдёт — ошибка ещё на компиляции.
// Именно из-за bound'а компилятор разрешает вызывать e.doubleValue() ниже:
// у произвольного T таких методов нет, а у Number — есть
public class NumberBox <T extends Number>{
    private List<T> list;

    public void setNumbers(List<T> list){
        this.list = list;
    }


    public  double getSum(){
        double sum = 0;
        for(T e : list){
            // doubleValue() — метод класса Number: превращает число ЛЮБОГО числового
            // типа (Integer, Double...) в double. Благодаря ему Integers и Doubles
            // складываются одним кодом без единого каста
            sum = sum + e.doubleValue();
        }
        return sum;
    }

}

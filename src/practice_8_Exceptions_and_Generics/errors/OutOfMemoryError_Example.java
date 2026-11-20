package practice_8_Exceptions_and_Generics.errors;

import java.util.*;

public class OutOfMemoryError_Example {
    public static void main(String[] args){
        List<Object> list = new ArrayList<>();
        while(true){
            list.add(new byte[1024 * 1024]);//добавляем 1 MB в список бесконечно
        }
    }
}

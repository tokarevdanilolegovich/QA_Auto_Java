package Exceptions_and_Generics.Exceptions;

import java.util.*;
import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        // FileReader открывает файл — это CHECKED-исключение: компилятор не даст
        // вызвать его без try/catch, поэтому обработка обязательна, а не по желанию
        FileReader fileReader = null;
        try{
            // FileNotFoundException — НАСЛЕДНИК IOException, поэтому ловится им же
            fileReader = new FileReader("data.txt");
        }catch (IOException e){
            // getMessage() достаёт текст исключения ("The system cannot find...")
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}
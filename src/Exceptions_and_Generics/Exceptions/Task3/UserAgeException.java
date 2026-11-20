package Exceptions_and_Generics.Exceptions.Task3;

import java.util.*;

// extends Exception (а НЕ RuntimeException) — значит CHECKED:
// компилятор заставит каждого вызывающего либо ловить его в try/catch, либо объявлять throws
public class UserAgeException extends Exception {
    // исключение — это просто «конверт с сообщением»: super(message) отдаёт
    // текст родительскому классу, потом его можно достать через e.getMessage()
    public UserAgeException(String message){
        super(message);
    }
}

package practice_8_Exceptions_and_Generics.exceptions.library.exceptions;

import java.util.*;
//непроверяемый - значит должны быть наследниками от Error(но не подходит) или от RuntimeException
public class InvalidBookException extends RuntimeException{
    public InvalidBookException(String message){
        super(message);
    }
    
}

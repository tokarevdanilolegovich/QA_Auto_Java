package practice_8_Exceptions_and_Generics.exceptions.library.exceptions;

import java.util.*;

//проверяемый -> значит должны наследоваться от Exception(или его наследников)
public class BookNotFoundException extends Exception{
     public BookNotFoundException(String message){
         super(message);
     }
}

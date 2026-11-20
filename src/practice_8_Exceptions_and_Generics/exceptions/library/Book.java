package practice_8_Exceptions_and_Generics.exceptions.library;

import java.util.*;

public class Book {
    private String name;
    private String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}

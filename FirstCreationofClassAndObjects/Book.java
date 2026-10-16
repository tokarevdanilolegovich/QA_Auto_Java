package FirstCreationofClassAndObjects;

public class Book {
    String title;
    String author;

    Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    //GETTERS
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }

    //SETTERS:
    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }

    public void printInfo(){
        System.out.println("Название книги: " + this.title + ", автор книги: " + this.author);

    }
    public static void main(String[] args){
        Book book1 = new Book("Война и Мир","Толстой");
        book1.printInfo();
        book1.setAuthor("Новый Толстой");
        book1.printInfo();
    }




}

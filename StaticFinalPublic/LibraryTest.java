package StaticFinalPublic;

public class LibraryTest {
    public static void main(String[] args){
        Library library1 = new Library();
        //System.out.println(library1.bookTitle); 'bookTitle' has private access in 'StaticFinalPublic.Library'
        System.out.println(library1.author);
        System.out.println(library1.year);
        System.out.println(library1.category);
//        System.out.println(library1.getBookTitle());
//        System.out.println(library1.getAuthor());
//        System.out.println(library1.getYear());
//        System.out.println(library1.getCategory());
        //через геттеры есть доступ вне зависимости от модификатора доступа у поля
    }


}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Author author1 = new Author("firsrName", "firstSerName");
    Author author3 = new Author("firsrName", "firstSerName");
    Author author2 = new Author("twiceName" , "twiceSerName");

    Book firstBook = new Book ("a a a", author1  , 2002);
    Book firstBook1 = new Book ("a a a", author1  , 2002);
    Book twiceBook = new Book ("b b b", author2, 2000);
        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        firstBook.setYear(1999);
        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        System.out.println(firstBook);


        System.out.println(firstBook.equals(firstBook1));
        System.out.println(firstBook.equals(twiceBook));
        System.out.println(author1.equals(author3));
        System.out.println(author1.equals(author2));


    }
}
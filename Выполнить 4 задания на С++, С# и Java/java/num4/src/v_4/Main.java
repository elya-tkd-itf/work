package v_4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Book book2 = new Book("Layer", "Jack_Layers", 1999, Type.DISTOPIA,
                new GregorianCalendar(1999, 12, 8));
        Book book1 = new Book("Lol", "Mark_Shtolts", 1980, Type.CRIME,
                new GregorianCalendar(1980, 2, 1));
        Book book3 = new Book();
        Book book4 = new Book("Optional", "Andrew_Smith", 2020, Type.CRIME,
                new GregorianCalendar(2020, 4, 16));

        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));

        for (Book book : books) {
            if (book.getType() == Type.CRIME) System.out.println(book);
        }

        Collections.sort(books, new Comparator<Book>() {
            public int compare(Book item1, Book item2) {
                if (item1.getCalendar().before(item2.getCalendar())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        System.out.println("--------------------------------------");

        for (Book book : books) {
            System.out.println(book);
        }
    }
}

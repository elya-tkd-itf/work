package v_4;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Lol", "Mark_Shtolts", 1980);
        book.diskOut();
        Book book2 = new Book();
        book2.diskIn();
        System.out.println(book2);
        System.out.println(book2.yearsFrom(2021));
        System.out.println(book2.daysFrom(2021, 12, 5));
    }
}

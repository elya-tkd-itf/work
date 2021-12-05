package v_4;

public class Main {

    public static void main(String[] args) {
	    Book book = new Book("Lol", "Mark Shtolts", 1980);
        System.out.println(book.yearsFrom(2021));
        System.out.println(book.daysFrom(2021, 12, 5));
    }
}

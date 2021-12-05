package v_4;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book() {
        name = "No name";
        author = "No author";
        year = -1;
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int yearsFrom(int nowYear) {
        return nowYear - year;
    }

    private boolean leap(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public int daysFrom(int nowYear, int nowMonth, int nowDay) {
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int year = this.year; year < nowYear; year++) {
            if (leap(year)) days += 366;
            else days += 365;
        }
        for (int month = 0; month < nowMonth; month++) {
            if (month == 1 && leap(nowYear)) days += 1;
            days += daysInMonth[month];
        }
        return days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

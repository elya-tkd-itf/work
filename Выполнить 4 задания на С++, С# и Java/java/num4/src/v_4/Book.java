package v_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {
    private String name;
    private String author;
    private int year;
    private Calendar calendar;
    private Type type;

    public Book() {
        name = "No name";
        author = "No author";
        year = -1;
        type = Type.NO;
        calendar = new GregorianCalendar(0, 0, 0);
    }

    public Book(String name, String author, int year, Type type, Calendar calendar) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.type = type;
        this.calendar = calendar;
    }

    public void diskIn() {
        try (FileReader reader = new FileReader("data.txt")) {
            int c;
            int state = 0;
            name = "";
            author = "";
            year = 0;
            while ((c = reader.read()) != -1) {
                if ((char) c == ' ') state++;
                else if (state == 0) name += (char) c;
                else if (state == 1) author += (char) c;
                else if (state == 2) {
                    year *= 10;
                    year += c - '0';
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void diskOut() {
        try (FileWriter writer = new FileWriter("data.txt", false)) {
            writer.write(this.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return name + " " + author + " " + year;
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

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

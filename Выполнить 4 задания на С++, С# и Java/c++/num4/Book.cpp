#include <iostream>
#include <string>
#include <fstream>

using namespace std;

enum class Genre {
    CRIME, DISTOPIA, CYBERPUNK, FANTASY, NOVEL, HORROR, NO
};

class Book {
private:
    int year_m;
    string name_m;
    string author_m;
    Genre type_m;
    bool leap(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
public:
    Book() {
        name_m = "No name";
        author_m = "No author";
        year_m = -1;
        type_m = Genre::NO;
    }

    Book(string name, string author, int year, Genre type) {
        name_m = name;
        author_m = author;
        year_m = year;
        type_m = type;
    }

    string toString() {
        return name_m + " " + author_m + " " + to_string(year_m);
    }

    int yearsFrom(int nowYear) {
        return nowYear - year_m;
    }

    int daysFrom(int nowYear, int nowMonth, int nowDay) {
        int daysInMonth[12] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int days = 0;
        for (int year = year_m; year < nowYear; year++) {
            if (leap(year)) days += 366;
            else days += 365;
        }
        for (int month = 0; month < nowMonth; month++) {
            if (month == 1 && leap(nowYear)) days += 1;
            days += daysInMonth[month];
        }
        return days;
    }

    void diskIn() {
        ifstream in("data.txt");
        if (in.is_open()) in >> name_m >> author_m >> year_m;
        in.close();
    }

    void diskOut() {
        ofstream out;
        out.open("data.txt");
        if (out.is_open()) out << toString() << endl;
        out.close();
    }

    string getName() {
        return name_m;
    }

    void setName(string name) {
        name_m = name;
    }

    string getAuthor() {
        return author_m;
    }

    void setAuthor(string author) {
        author_m = author;
    }

    int getYear() {
        return year_m;
    }

    void setYear(int year) {
        year_m = year;
    }

    Genre getType() {
        return type_m;
    }

    void setType(Genre type) {
        type_m = type;
    }
};

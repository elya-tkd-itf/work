#include <iostream>
#include "Book.cpp"

using namespace std;

int main()
{
    Book book1("ll", "kl", 1580, Genre::CRIME);
    Book book2("ene", "bwu", 1234, Genre::FANTASY);
    Book book3("ls0", "k5gl", 2018, Genre::CRIME);
    Book book4;

    Book books[4] = { book1, book2, book3, book4};
    
    for (Book book : books) {
        if (book.getType() == Genre::CRIME) cout << book.toString() << endl;
    }
    return 0;
}
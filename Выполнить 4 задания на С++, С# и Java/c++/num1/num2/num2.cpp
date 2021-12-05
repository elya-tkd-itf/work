#include <iostream>
#include "Book.cpp"

using namespace std;

int main()
{
    Book book("ll", "kl", 1234);
    book.diskOut();
    Book book2;
    book2.diskIn();
    cout << book2.toString() << endl;;
    return 0;
}
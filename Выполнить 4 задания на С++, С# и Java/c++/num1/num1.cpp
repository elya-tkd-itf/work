#include <iostream>
#include "Book.cpp"

using namespace std;

int main()
{
    Book book("ll", "kl", 1234);
    cout << book.daysFrom(2021, 12, 5) << " " << book.yearsFrom(2021) << endl;
    return 0;
}
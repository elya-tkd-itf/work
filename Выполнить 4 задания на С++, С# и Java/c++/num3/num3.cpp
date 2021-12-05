#include <iostream>
#include <fstream>
#include <set>

using namespace std;

int main()
{
    ifstream in("input.txt");
    set<char> chars{ 'e', 'y', 'u', 'i', 'o', 'a' };
    if (in.is_open()) {
        string str;
        while (in >> str) {
            if (chars.find(str.at(str.size() - 1)) != chars.end()) 
                cout << str << " ";
        }
    }
}
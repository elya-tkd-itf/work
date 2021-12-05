using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace num2
{
    class Program
    {
        static void Main(string[] args)
        {
            Book book = new Book("Lol", "Mark_Shtolts", 1980);
            book.diskOut();
            Book book2 = new Book();
            book2.diskIn();
            Console.WriteLine(book2.ToString());
            Console.WriteLine(book2.yearsFrom(2021));
            Console.WriteLine(book2.daysFrom(2021, 12, 5));
            Console.ReadKey();
        }
    }
}

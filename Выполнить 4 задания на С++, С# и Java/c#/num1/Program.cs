using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace num1
{
    class Program
    {
        static void Main(string[] args)
        {
            Book book = new Book("Lol", "Mark Shtolts", 1980);
            Console.WriteLine(book.yearsFrom(2021));
            Console.WriteLine(book.daysFrom(2021, 12, 5));
            Console.ReadKey();
        }
    }
}

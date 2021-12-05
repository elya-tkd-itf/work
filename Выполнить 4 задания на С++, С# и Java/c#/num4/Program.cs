using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace num4
{
    class Program
    {
        static void Main(string[] args)
        {
            Book book2 = new Book("Layer", "Jack_Layers", 1999, Type.DISTOPIA,
                new DateTime(1999, 12, 8));
            Book book1 = new Book("Lol", "Mark_Shtolts", 1980, Type.CRIME,
                    new DateTime(1980, 2, 1));
            Book book3 = new Book();
            Book book4 = new Book("Optional", "Andrew_Smith", 2020, Type.CRIME,
                    new DateTime(2020, 4, 16));
            Book[] books = new Book[4]{ book1, book2, book3, book4 };

            foreach (var book in books)
            {
                if (book.getType() == Type.CRIME) 
                    Console.WriteLine(book);
            }

            Console.WriteLine("---------------------------------");

            var list = books.OrderBy(x => x.getDay()).ToList();

            foreach (var book in list)
            {
                Console.WriteLine(book);
            }
            Console.ReadKey();
        }
    }
}

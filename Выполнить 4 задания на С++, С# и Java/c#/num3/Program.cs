using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace num3
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                using (StreamReader sr = new StreamReader("input.txt"))
                {
                    HashSet<char> chars = new HashSet<char>();
                    chars.Add('e'); chars.Add('y'); chars.Add('u'); 
                    chars.Add('o'); chars.Add('a'); chars.Add('i');
                    String[] strings = sr.ReadLine().Split(' ');
                    foreach (var str in strings)
                    {
                        if (chars.Contains(str.ElementAt(str.Length - 1)))
                            Console.WriteLine(str);
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();
        }
    }
}

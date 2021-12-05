using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace num2
{
    public class Book
    {
        private String name, author;
        private int year;
        public Book()
        {
            this.name = "No name";
            this.author = "No author";
            this.year = -1;
        }
        public Book(String name, String author, int year)
        {
            this.name = name;
            this.author = author;
            this.year = year;
        }

        public void diskOut()
        {
            try
            {
                using (StreamWriter sw = new StreamWriter("data.txt", false, System.Text.Encoding.Default))
                {
                    sw.WriteLine(ToString());
                }
            } catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

        public void diskIn()
        {
            try
            {
                using (StreamReader sr = new StreamReader("data.txt"))
                {
                    String[] strings = sr.ReadLine().Split(' ');
                    name = strings[0]; 
                    author = strings[1];
                    year = Int16.Parse(strings[2]);
                }
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

        public override string ToString()
        {
            return name + " " + author + " " + year;
        }

        public int yearsFrom(int nowYear)
        {
            return nowYear - year;
        }

        private bool leap(int year)
        {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }

        public int daysFrom(int nowYear, int nowMonth, int nowDay)
        {
            int[] daysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int days = 0;
            for (int year = this.year; year < nowYear; year++)
            {
                if (leap(year)) days += 366;
                else days += 365;
            }
            for (int month = 0; month < nowMonth; month++)
            {
                if (month == 1 && leap(nowYear)) days += 1;
                days += daysInMonth[month];
            }
            return days;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getAuthor()
        {
            return author;
        }

        public void setAuthor(String author)
        {
            this.author = author;
        }

        public int getYear()
        {
            return year;
        }

        public void setYear(int year)
        {
            this.year = year;
        }
    }

}
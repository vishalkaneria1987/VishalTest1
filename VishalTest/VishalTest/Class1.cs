using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VishalTest
{
    [TestClass]
    public class Program
    {
        [TestMethod]
      public static void Main(String[] arg)
        {
            Console.WriteLine(CreateMessage());
        }
        public static string CreateMessage()
        {
            return "Vishal";
        }
    }

    internal class TestMethodAttribute : Attribute
    {
    }

    internal class TestClassAttribute : Attribute
    {
    }
}
using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using VishalTest;

namespace HelloVishal
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()

        {
            // Console.WriteLine ("Vishal");
            Assert.AreEqual("Vishal", Program.CreateMessage());  
        }

    }
}

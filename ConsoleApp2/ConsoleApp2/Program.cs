using System;
using System.Net;
using System.Net.Http;
using System.Xml.Linq;

namespace ConsoleApp2
{
    class Program
    {
        private const string V = @"http://localhost:8080/wphf/CarQuery?brand=opel";

        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            using (var client = new WebClient())
            {
                string xml_text = client.DownloadString(V);
                XDocument doc = XDocument.Parse(xml_text);
                Console.WriteLine(doc);
                Console.ReadLine();
            
            }

        }
    }
}

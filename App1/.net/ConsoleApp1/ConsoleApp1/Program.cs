using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            ServiceReference1.BanqueServiceClient stub = new ServiceReference1.BanqueServiceClient();
            Console.WriteLine(stub.ConvertionEuroToDH(20));
            ServiceReference1.compte cpt = stub.getCompte(4);
            Console.WriteLine(cpt.code);
            Console.WriteLine(cpt.solde);
            var lst = stub.listComptes();
            foreach(var c in lst)
            {
                Console.WriteLine("-------------------------------");
                Console.WriteLine(c.code);
                Console.WriteLine(c.solde);
            }
            Console.ReadLine();
        }
    }
}

// summation of 1 to N
// time complexity of this algorithms is O(n)
/*using System;

public class Program
{
    static void Main()
    {
        Console.Write("Enter a number: ");
        int n = Convert.ToInt32(Console.ReadLine());

        int sumOfOneToN = 0;
        for (int i = 0; i <= n; i++)
        {
            sumOfOneToN += i;
        }

        Console.WriteLine(
            "The summation of 1 to " + n + " is " + sumOfOneToN
        );
    }
}*/

// summation of 1 to N
// time complexity of this algorithms is O(1)
using System;

public class Program
{
    static void Main()
    {
        Console.Write("Enter a number: ");
        int n = Convert.ToInt32(Console.ReadLine());

        int sumOfOneToN = n * (n + 1) / 2;

        Console.WriteLine(
            "The summation of 1 to " + n + " is " + sumOfOneToN
        );
    }
}
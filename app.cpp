// summation of 1 to N
// time complexity of this algorithms is O(n)
/*#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int sumOfOneToN = 0;
    for (int i = 1; i <= n; i++)
    {
        sumOfOneToN += i;
    }

    cout << "The summation of 1 to " << n << " is " << sumOfOneToN;

    return 0;
}*/

// summation of 1 to N
// time complexity of this algorithms is O(1)
#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int sumOfOneToN = n * (n + 1) / 2;
    

    cout << "The summation of 1 to " << n << " is " << sumOfOneToN;

    return 0;
}
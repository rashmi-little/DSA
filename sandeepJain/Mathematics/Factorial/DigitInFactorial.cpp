#include <iostream> 
#include <math.h>
using namespace std;
class Solution {
    public:
    int digitInFactorial (int number) {
        long long factValue = 1;

        while(number != 1) {
            factValue *=(number--);
        }
        return floor(log10(factValue)) + 1;
    }

};
int main () {
    cout << "Enter the number you to find the digit in whose factorial" << endl;
    int number;
    cin >> number;
    Solution solution;
    cout << solution.digitInFactorial(number);
}

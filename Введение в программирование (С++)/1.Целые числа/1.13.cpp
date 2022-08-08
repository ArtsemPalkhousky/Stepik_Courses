// Дано четырехзначное число. Определите, является ли его десятичная
// запись симметричной. Если число симметричное, то выведите 1, иначе
// выведите любое другое целое число. Число может иметь меньше четырех
// знаков, тогда нужно считать, что его десятичная запись дополняется
// слева незначащими нулями.

#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    cout << (((n / 100) % 10 * 10) + (n / 1000)) - n % 100 + 1;
    return 0;
}
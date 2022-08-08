// Дано целое трехзначное число. Найдите сумму его цифр.

#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    cout << (N / 100) + (N % 10) + ((N / 10) % 10);
    return 0;
}
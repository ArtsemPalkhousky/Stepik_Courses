// Улитка ползет по вертикальному шесту высотой H метров, поднимаясь за день на A метров, а за ночь спускаясь на B метров.
// На какой день улитка доползет до вершины шеста?

// Sample Input:
// 10
// 3
// 2

// Sample Output:
// 8

#include <iostream>
using namespace std;

int main() {
    int H, A, B, T;
    cin >> H >> A >> B;
    T = (H - 2 * B + A - 1) / (A - B);
    cout << T;
    return 0;
}
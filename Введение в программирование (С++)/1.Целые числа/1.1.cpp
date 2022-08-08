//N белочек нашли K орешков и решили разделить их поровну.
//Определите, сколько орешков достанется каждой белочке.

#include <iostream>
using namespace std;

int main() {
    int N, K;
    cin >> N;
    cin >> K;
    cout << K / N;
    return 0;
}
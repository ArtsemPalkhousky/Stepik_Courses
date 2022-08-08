// Даны три целых числа. Найдите наибольшее из них 
// (программа должна вывести ровно одно целое число). \
// Под наибольшим в этой задаче понимается число, которое не меньше,
// чем любое другое.

#include <iostream>
using namespace std;

int main() {
  int a, b, c;
  cin >> a >> b >> c;
  if (a >= b) {
      if (a >= c) {
          cout << a;
      }
      else {
          cout << c;
      }
  }
  else 
      if (b >= c) {
          cout << b;
      }
      else {
          cout << c;
      }
  return 0;
}
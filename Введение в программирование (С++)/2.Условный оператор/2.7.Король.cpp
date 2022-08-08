// Шахматный король ходит по горизонтали, вертикали и диагонали,
// но только на 1 клетку. Даны две различные клетки шахматной доски,
// определите, может ли король попасть с первой клетки на вторую \
// одним ходом.

#include <iostream>
using namespace std;

int main() { 
  int x1, y1, x2, y2;
  cin >> x1 >> y1 >> x2 >> y2;
  if (x1 == (x2 - 1) || x1 == (x2 + 1) || x1 == x2) 
      if (y1 == (y2 - 1) || y1 == (y2 + 1) || y1 == y2) { 
          cout << "YES";
          return 0;
      }
  cout << "NO";
  return 0;
}
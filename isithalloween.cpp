#include <iostream>

//#include <bits/stdc++.h>
using namespace std;

int main() {
  string m;
  int d;
  cin >> m >> d;
  if(m == "OCT" and d == 31 || m == "DEC" and d == 25){;
    cout << "yup";
  } else {
    cout << "nope";
  }
  return 0;
}
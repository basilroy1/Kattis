#include <iostream>
using namespace std;
int main() {
	int a, b, c , d , e , f, g, h;
	while(cin >> a >> b >> c >> d >> e >> f)
	{
		if(a != c && a != e)
			g = a;
		if(b != d && b != f)
			h = b;
		if(c != a && c != e)
			g = e;
		if(d != f && d != b)
			h = d;
		if(e != a && e != c)
			g = e;
		if(f != d && f!= b)
			h = f;
		cout << g << " " << h;
	}
	return 0;   
}